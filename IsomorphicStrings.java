package kunal;

import java.util.Collection;
import java.util.HashMap;

public class IsomorphicStrings {
	public static boolean isIsomorphic(String s, String t) {
    HashMap<Character, Character> map = new HashMap<>();
    	for(int i = 0; i<s.length();i++) {
    		char c = s.charAt(i);
    		char c2 = t.charAt(i);
    		if(!map.containsKey(c)) {
    			Collection<Character> keys = map.values();
    			for(Character e : keys) {
    				if (c2 == e) {
    					return false;
    				}
    			}
    			map.put(c, c2);
    		}
    	}
    	
    	    	
    	for (int i = 0; i < t.length(); i++) {
			char c = s.charAt(i);
			char c2 = t.charAt(i);
			char charAtMapKey = map.get(c);
			if(charAtMapKey!=c2) {
				return false;
			}
			else {
				continue;
			}
		}
    	return true;
    }
	public static void main(String[] args) {
		System.out.println(isIsomorphic("badc", "baba"));
	}
}
