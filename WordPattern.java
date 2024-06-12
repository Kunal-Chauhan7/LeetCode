package kunal;

import java.util.HashMap;

public class WordPattern {
	public boolean wordPattern(String pattern, String s) {
		String[] p = pattern.split("");
	    String[] str = s.split(" ");
	    if(p.length!=str.length)
	    	return false;
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < p.length; i++) {
			if (!map.containsKey(p[i])) {
	            if (map.containsValue(str[i])) {
	                return false;
	            }
	            map.put(p[i], str[i]);
	        }
			else {
				String toCheck = map.get(p[i]);
				if(!toCheck.equals(str[i])) {
					return false;
				}
			}
		}
		return true;
    }
}
