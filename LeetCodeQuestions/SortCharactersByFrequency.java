package kunal;

import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {
	public static String frequencySort(String s) {
		StringBuilder str = new StringBuilder();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!map.containsKey(c))
				map.put(c, 1);
			else{
				int value = map.get(c);
				value++;
				map.put(c, value);
			}
		}
		
		for (int i = 0; i < map.size(); i++) {
			int max = Integer.MIN_VALUE;
			char maxChar = 0;
			for(Map.Entry<Character, Integer>e:map.entrySet()) {
				if(e.getValue()>max) {
					max=e.getValue();
					maxChar=e.getKey();
				}
			}
			if(max==-1)
				break;
			else
				map.put(maxChar, -1);					
			for (int j = 0; j < max; j++)
				str.append(maxChar);
		}
		return str.toString();
    }
	public static void main(String[] args) {
		System.out.println(frequencySort("Aabb"));
	}
}
