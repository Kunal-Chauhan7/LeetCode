package kunal;

import java.util.HashMap;
import java.util.Map;

public class RedistributeCharsToMakeAllStringsEqual {
	public static boolean makeEqual(String[] words) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				if (map.containsKey(words[i].charAt(j))) {
					int val = map.get(words[i].charAt(j));
					val++;
					map.put(words[i].charAt(j), val);
				}
				else {
					map.put(words[i].charAt(j), 1);
				}
			}
		}
		Integer[] values = map.values().toArray(new Integer[map.size()]);
		for (int i = 1; i < values.length; i++) {
			if(values[i] == values[i-1]) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
    }
	public static void main(String[] args) {
		String[] words = {"abc","aabc","bc"};
		System.out.println(makeEqual(words));
	}
}
