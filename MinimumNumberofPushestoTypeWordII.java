package kunal;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class MinimumNumberofPushestoTypeWordII {
	public static int minimumPushes(String word) {
		TreeMap<Character, Integer>map = new TreeMap<>(Collections.reverseOrder());
		for(char c : word.toCharArray()) {
			if(!map.containsKey(c))
				map.put(c, 1);
			else
				map.put(c, map.get(c)+1);
		}
		int ans = 0;
		int index = 0;
		int val = 1;
		for(Map.Entry<Character, Integer> e :map.entrySet()) {
			if(index>7 && index < 14) {
				val = 2;
			}
			ans+= val * e.getValue();
			index++;
		}
		return ans;
    }
	public static void main(String[] args) {
		System.out.println(minimumPushes("alporfmdqsbhncwyu"));
	}
}
