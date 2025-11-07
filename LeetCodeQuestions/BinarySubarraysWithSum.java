package kunal;

public class BinarySubarraysWithSum {
	public int numSubarraysWithSum(int[] nums, int goal) {
		return helper(nums, goal) - helper(nums, goal-1);
    }
	int helper(int[] nums, int goal) {
        if(goal < 0)
            return 0;
		int start = 0;
		int end = 0;
		int currSum = 0;
		int ans = 0;
		for(end = 0;end < nums.length;end++) {
			currSum+=nums[end];
			while(currSum>goal) {
				currSum-=nums[start];
				start++;
			}
			ans += end-start+1;
		}
		return ans;
	}
}
