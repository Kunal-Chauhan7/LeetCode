package kunal;

import java.util.HashSet;

public class NumberOfSpecialChars {
	public static int numberOfSpecialChars(String word) {
		HashSet<Character> set = new HashSet<>();
		int ans = 0;
		for(char c : word.toCharArray()) {
			set.add(c);
		}
		for(char c : set) {
			if(c>='a'&&c<='z')
				if(set.contains((char)(c-32)))ans++;
		}
		return ans;
    }
	public static void main(String[] args) {
		System.out.println(numberOfSpecialChars("aaAbcBC"));
	}
}
