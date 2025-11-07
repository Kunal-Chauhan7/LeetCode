package kunal;

public class MaxConsecutiveOnesIII {
	public int longestOnes(int[] nums, int k) {
		int left = 0;
		int right = 0;
		int NumberOfZeros = 0;
		int maxLength = 0;
		while(right < nums.length) {
			int a = nums[right];
			if(a==0)
				NumberOfZeros++;
			while(NumberOfZeros>k) {
				if(nums[left]==0) {
					NumberOfZeros--;
				}
				left++;
			}
			maxLength = Math.max(maxLength, right-left+1);
			right++;
		}
		return maxLength;
    }
}
