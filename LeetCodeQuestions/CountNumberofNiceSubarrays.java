package kunal;

public class CountNumberofNiceSubarrays {
	public int numberOfSubarrays(int[] nums, int k) {
		return numberOfSubarrayshelper(nums, k) - numberOfSubarrayshelper(nums, k-1);
	}
	public int numberOfSubarrayshelper(int[] nums, int k) {
		int start = 0;
		int end = 0;
		int currNumOfOdd = 0;
		int ans = 0;
		while(end < nums.length) {
			if(nums[end]%2!=0) {
				currNumOfOdd++;
			}
			while(currNumOfOdd>k) {
				if(nums[start]%2!=0) {
					currNumOfOdd--;
				}
				start++;
			}
			ans += end-start;
			end++;
		}
		return ans;
	}
}
