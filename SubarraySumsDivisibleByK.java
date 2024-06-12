package kunal;

import java.util.HashMap;

public class SubarraySumsDivisibleByK {
	public int subarraysDivByK(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int sum = 0;
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			int toLook = sum%k;
			if (toLook < 0)
	            toLook += k;
			if(map.containsKey(toLook)) {
				counter+=map.get(toLook);
			}
			map.put(toLook, map.getOrDefault(toLook, 0)+1);
		}
		return counter;
    }
}
