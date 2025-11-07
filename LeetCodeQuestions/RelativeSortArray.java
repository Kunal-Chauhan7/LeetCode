package kunal;

import java.util.Arrays;
import java.util.HashMap;

public class RelativeSortArray {
//	public int[] relativeSortArray(int[] arr1, int[] arr2) {
//		TreeMap<Integer, Integer> map = new TreeMap<>();
//		for(int i = 0 ; i < arr1.length ; i++) {
//			int a = arr1[i];
//			if(!map.containsKey(a))
//				map.put(a, 1);
//			else {
//				map.put(a, map.get(a)+1);
//			}
//		}
//		int index = 0;
//		for(int j = 0 ; j < arr2.length ; j++) {
//			int a = map.get(arr2[j]);
//			for(int k = 0 ; k < a ; k++) {
//				arr1[index] = arr2[j];
//				index++;
//			}
//			map.remove(arr2[j]);
//		}
//		for(Map.Entry<Integer, Integer>e:map.entrySet()) {
//			int a = map.get(e.getKey());
//			for(int i = 0; i < a ; i++) {
//				arr1[index] = e.getKey();
//				index++;
//			}
//		}
//		return arr1;
//    }
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		Arrays.sort(arr1);
		for(int i = 0 ; i < arr1.length ; i++) {
			int a = arr1[i];
			if(!map.containsKey(a))
				map.put(a, 1);
			else {
				map.put(a, map.get(a)+1);
			}
		}
		int index = 0;
		for(int j = 0 ; j < arr2.length ; j++) {
			int a = map.get(arr2[j]);
			for(int k = 0 ; k < a ; k++) {
				arr1[index] = arr2[j];
				index++;
			}
		}
		return arr1;
    }
}
