package kunal;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
	public List<String> commonChars(String[] words) {
		ArrayList<String> ans = new ArrayList<>();
		int[] minFreq = new int[26];
		for(char c : words[0].toCharArray())
			minFreq[c-'a']++; 
		for(String s:words) {
			int[] charCount = new int[26];
			for(char c : s.toCharArray())
				charCount[c-'a']++;
			for(int i = 0 ; i < 26 ; i++)
				minFreq[i] = Math.min(minFreq[i], charCount[i]);
		}
		for(int i = 0 ; i<26; i++) {
			for(int j = 0 ; j < minFreq[i];j++) {
				ans.add(String.valueOf((char)(i+'a')));
			}
		}
		return ans;
	}
}
