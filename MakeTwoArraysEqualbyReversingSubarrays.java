package kunal;

import java.util.HashMap;

public class MakeTwoArraysEqualbyReversingSubarrays {
	public static boolean canBeEqual(int[] target, int[] arr) {
		HashMap<Integer, Integer> map1 = new HashMap<>();
		HashMap<Integer, Integer> map2 = new HashMap<>();
		for(int i : target) {
			if(!map1.containsKey(i))
				map1.put(i, 1);
			else
				 map1.put(i,map1.get(i)+1);
		}
		for(int i : arr) {
			if(!map2.containsKey(i))
				map2.put(i, 1);
			else
				 map2.put(i,map2.get(i)+1);
		}
		return map1.equals(map2);
		
//		public boolean canBeEqual(int[] target, int[] arr) {
//	        if(target.length!=arr.length)return false;
//	        Arrays.sort(arr);
//	        Arrays.sort(target);
//	        for(int i = 0 ; i < arr.length;i++){
//	            if(arr[i]!=target[i])return false;
//	        }
//	        return true;
//	    }
    }
	public static void main(String[] args) {
		int[] arr = {1,2,2,3};
		int[] arr2 = {1,1,2,3};
		System.out.println(canBeEqual(arr, arr2));
	}
}
