package kunal;

import java.util.HashSet;

public class LongestPalindrome {
	 public static int longestPalindrome(String str) {
	        StringBuilder s = new StringBuilder(str);
			int ans = 0;
			HashSet<Character> set = new HashSet<>();
			for (int i = 0; i < s.length(); i++) {
				if(!set.contains(s.charAt(i)))
					set.add(s.charAt(i));
				else {
					set.remove(s.charAt(i));
					ans+=2;
				}
			}
			if(set.isEmpty())
				return ans;
			return ans+1;
		}
	public static void main(String[] args) {
		System.out.println(longestPalindrome("a"));
	}
}
