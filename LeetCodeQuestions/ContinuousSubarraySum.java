package kunal;

import java.util.HashMap;

public class ContinuousSubarraySum {
	public static boolean checkSubarraySum(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int n = nums.length;
		int sum = 0;
		for(int index = 0 ; index < n; index++) {
			sum+=nums[index];
			int rem = sum%k;
			if(map.containsKey(rem)) {
				int diff = index - map.get(rem);
				if(diff>1)
					return true;
			}
			else
				map.put(rem, index);
		}
		return false;
    }
	public static void main(String[] args) {
		int[] arr = {23,2,6,4,7};
		System.out.println(checkSubarraySum(arr, 8));
	}
}
