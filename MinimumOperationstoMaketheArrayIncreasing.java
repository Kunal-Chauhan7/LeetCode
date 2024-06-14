package kunal;


public class MinimumOperationstoMaketheArrayIncreasing {
	public int minOperations(int[] nums) {
		int moves = 0;
		for(int i = 1 ; i < nums.length ; i++) {
			if(nums[i]<=nums[i-1]) {
				moves+=(nums[i-1] - nums[i]+1);
				nums[i] = nums[i-1]+1;
			}
		}
		return moves;
    }
}
