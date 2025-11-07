package kunal;

import java.util.Arrays;

public class PartitionArraySuchThatMaximumDifferenceIsK {
	public int partitionArray(int[] nums, int k) {
		Arrays.sort(nums);
		int max = nums[0];
		int min = nums[0];
		int res = 1;
		for(int i : nums) {
			max = Math.max(max, i);
			min = Math.min(min, i);
			if(max-min>k) {				
				res++;
				max = min = i;
			}
		}
		return res;
	}
}
