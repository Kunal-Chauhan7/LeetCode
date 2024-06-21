package kunal;

import java.util.Arrays;

public class HouseRobberII {
	public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0],nums[1]);
		int[] dp = new int[nums.length];
		Arrays.fill(dp, -1);
		int AnsAfterSkiping1stHouse = helper(Arrays.copyOfRange(nums, 1, nums.length));
		int AnsAfterSkiping2ndHouse = helper(Arrays.copyOfRange(nums, 0, nums.length-1));
		return Math.max(AnsAfterSkiping1stHouse, AnsAfterSkiping2ndHouse);
    }
	public int helper(int[] nums) {
        int rob = 0;
        int norob = 0;
        for (int i = 0; i < nums.length; i ++) {
            int newRob = norob + nums[i];
            int newNoRob = Math.max(norob, rob);
            rob = newRob;
            norob = newNoRob;
        }
        return Math.max(rob, norob);
    }
}
