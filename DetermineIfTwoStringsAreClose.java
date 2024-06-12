package kunal;

import java.util.Arrays;

public class DetermineIfTwoStringsAreClose {
	
	public static boolean closeStrings(String word1, String word2) {
		if(word1.length()!=word2.length())
			return false;
		int[] arr = new int[26];
		int[] arr2 = new int[26];
		for(int i = 0 ; i < word1.length();i++) {
			char c = word1.charAt(i);
			arr[c - 'a']++;
		}
		for(int i = 0 ; i < word2.length();i++) {
			char c = word2.charAt(i);
			arr2[c - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			if((arr[i]==0&&arr2[i]!=0)||(arr2[i]==0&&arr2[i]!=0))
				return false;
			Arrays.sort(arr);Arrays.sort(arr2);
		}
		for (int i = 0; i < 26; i++) {
			if(arr[i]!=arr2[i])
				return false;
		}
		return true;
    }
	public static void main(String[] args) {
		System.out.println(closeStrings("uau", "ssx"));
	}
}
