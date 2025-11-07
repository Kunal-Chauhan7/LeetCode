package kunal;

public class MaximumProductSubarray {
	public int maxProduct(int[] nums) {
		int prefix = 1;
		int sufix = 1;
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if(prefix == 0)
				prefix = 1;
			if(sufix==0)
				sufix = 1;
			sufix*= nums[i];
			prefix*=nums[nums.length-1-i];
			ans = Math.max(sufix, prefix);
		}
		return ans;
    }
}
