package kunal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberofOccurrences {
	public static boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			int k = arr[i];
			if(!map.containsKey(k)) {
				map.put(k, 1);
			}
			else {
				int value = map.get(k);
				value++;
				map.put(k, value);
			}
		}
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			if(set.contains(e.getValue()))
				return false;
			else
				set.add(e.getValue());
		}
		return true;
    }
	public static void main(String[] args) {
		int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
		System.out.println(uniqueOccurrences(arr));
	}
}
