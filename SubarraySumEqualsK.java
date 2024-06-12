package kunal;

import java.util.HashMap;

public class SubarraySumEqualsK {
	public static int subarraySum(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int sum = 0;
		int ans = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			sum+=nums[i];
			int tolook = sum - k;
			if(map.containsKey(tolook)) {
				ans+=map.get(tolook);
			}
			 map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return ans;
    }
	public static void main(String[] args) {
		int [] arr = {1,1,1};
		System.out.println(subarraySum(arr, 2));
	}
}
