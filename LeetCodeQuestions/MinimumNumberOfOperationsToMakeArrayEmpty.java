package kunal;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfOperationsToMakeArrayEmpty {
	public static int minOperations(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int element = nums[i];
			if(map.containsKey(element)) {
				int value = map.get(element);
				value++;
				map.put(element, value);
			}
			else {
				map.put(element, 1);
			}
		}
		int ans = 0;
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			int value = e.getValue();
			if(value>=2) {
				int temp = 0;
				if (value%3>0) {
					temp = 1;
				}
				ans = ans + (temp + (value/3));
				
			}
			else {
				return -1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {2,3,3,2,2,4,2,3,4};
		System.out.println(minOperations(arr));
	}
}
