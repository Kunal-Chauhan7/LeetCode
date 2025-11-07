package kunal;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int element = nums[i];
			int toFind = target - element;
			if(!map.containsKey(element)) {
				if(map.containsKey(toFind))
					return new int[] {i,map.get(toFind)};
				map.put(element, i);
			}
			else {
				if(map.containsKey(toFind))
					return new int[] {i,map.get(toFind)};
			}
		}
		return new int[] {};
    }
	public static void main(String[] args) {
		System.out.println( Arrays.toString(twoSum(new int []{3,3}, 6)));
	}
}
