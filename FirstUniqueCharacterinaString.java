package kunal;

import java.util.HashMap;
//import java.util.Map;

public class FirstUniqueCharacterinaString {
//	public static int firstUniqChar(String s) {
//		int min = Integer.MAX_VALUE;
//		HashMap<Character, Integer> map = new HashMap<>();
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if(!map.containsKey(c))
//				map.put(c, 1);
//			else {
//				int value = map.get(c);
//				value++;
//				map.put(c, value);
//			}
//		}
//		for(Map.Entry<Character, Integer> e : map.entrySet()) {
//			if(e.getValue()==1)
//				if(min>s.indexOf(e.getKey()))
//					min = s.indexOf(e.getKey());
//		}
//		if(min==Integer.MAX_VALUE)
//			return -1;
//		return min;
//    }
	
	public static int firstUniqChar(String s) {
//		int min = Integer.MAX_VALUE;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!map.containsKey(c))
				map.put(c, 1);
			else {
				int value = map.get(c);
				value++;
				map.put(c, value);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(map.get(c)==1)
				return i;
		}
		return -1;
    }
	
	public static void main(String[] args) {
		System.out.println(firstUniqChar("aabb"));
	}
}
