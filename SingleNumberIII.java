package kunal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberIII {
	public static int[] singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(!map.containsKey(nums[i]))
				map.put(nums[i], 1);
			else {
				int value = map.get(nums[i]);
				value++;
				map.put(nums[i], value);
			}
		}
		int n = 0;
		for(Map.Entry<Integer, Integer>e : map.entrySet()) {
			if(e.getValue()==1)
				n++;
		}
		int [] arr = new int[n];
		int i  = 0;
		for(Map.Entry<Integer, Integer>e : map.entrySet()) {
			if(e.getValue()==1) {
				arr[i] = e.getKey();
				i++;
			}
		}
		return arr;
    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(singleNumber(new int[]{-1,0})));
	}
}
