package kunal;

import java.util.HashMap;

public class Checkifallcharactershaveequalnumberofoccurrences {
	public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				int value = map.get(s.charAt(i));
				value++;
				map.put(s.charAt(i), value);
			}
			else {
				map.put(s.charAt(i), 1);
			}
		}
        Integer[] values = map.values().toArray(new Integer[map.size()]);
        for(int i = 1;i<values.length;i++) {
        	if (values[i] == values[i-1]) {
				continue;
			}
        	else {
        		return false;
        	}
        }
        return true;
	}
}
