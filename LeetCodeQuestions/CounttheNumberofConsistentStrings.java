package kunal;

import java.util.HashSet;

public class CounttheNumberofConsistentStrings {
	public int countConsistentStrings(String allowed, String[] words) {
		HashSet<Character> set = new HashSet<>();
		int ans = 0;
		boolean toAdd = true;
		for(char c : allowed.toCharArray()) {
			set.add(c);
		}
		for(String s : words) {
			toAdd = true;
			for(char c :s.toCharArray()) {
				if(!set.contains(c)) {
					toAdd = false;
					break;
				}
			}
			if(toAdd)ans++;
		}
		return ans;
    }
}
