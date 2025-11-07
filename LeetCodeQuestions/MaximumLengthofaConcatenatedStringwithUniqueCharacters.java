package kunal;

import java.util.ArrayList;
import java.util.List;

public class MaximumLengthofaConcatenatedStringwithUniqueCharacters {
	public static int solve(int i ,List<String>arr , int n , String t) {
		int exclude = 0;
		int include = 0;
		if(i>=n)
			return t.length();
		if(containDuplicates(arr.get(i),t))
			exclude =  solve(i+1, arr, n, t);
		else {
			include = solve(i+1, arr, n, t+arr.get(i));
			exclude = solve(i+1, arr, n, t);
		}
		return  Math.max(include, exclude);
	}
	public static boolean containDuplicates(String s1 , String s2) {
		int[] chararr = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			if(chararr[s1.charAt(i) - 'a']>0) {
				return true;
			}
			chararr[s1.charAt(i) - 'a']++; 
		}
		for (int i = 0; i < s2.length(); i++) {
			if(chararr[s2.charAt(i)-'a'] > 0) {
				return true;
			}
		}
		return false;
	}
	public int maxLength(List<String> arr) {
        String t = "";
        int n = arr.size();
        return solve(0, arr, n, t);
    }
	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		arr.add("abcdefghijklmnopqrstuvwxyz");
//		System.out.println(maxLength(arr));
	}
}
