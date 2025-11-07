package kunal;

import java.util.HashMap;
import java.util.Map;

public class RedistributeCharsToMakeAllStringsEqual {
	public static boolean makeEqual(String[] words) {
		HashMap<Character, Integer> map = new HashMap<>();
		if(words.length==1)
			return true;
		for(String s : words) {
			for(char c : s.toCharArray()) {
				if(!map.containsKey(c)) 
					map.put(c, 1);
				else
					map.put(c, map.get(c)+1);
			}
		}
		int n = words.length;
		for(Map.Entry<Character, Integer>e:map.entrySet()) {
			if(e.getValue()%n!=0)
				return false;
		}
		return true;
    }
	public static void main(String[] args) {
		String[] words = {"abc","aabc","bc"};
		System.out.println(makeEqual(words));
	}
}
