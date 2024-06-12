package kunal;

import java.util.HashMap;

public class ReorganizeString {
	public String reorganizeString(String s) {
		String ans = "";
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				int value = map.get(c);
				value++;
				map.put(c, value);
			}
		}
		return ans;
    }
}
