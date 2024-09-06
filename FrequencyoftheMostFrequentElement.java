package kunal;

import java.util.Arrays;

public class FrequencyoftheMostFrequentElement {
	public static int maxFrequency(int[] nums, int k) {
		Arrays.sort(nums);
		int l = 0 , r = 0 , total = 0 , res = 0;
		while(r<nums.length) {
			total+=nums[r];
			while(nums[r]*(r-l+1)>total+k) {
				total-=nums[l];
				l++;
			}
			res = Math.max(res, r-l+1);
			r++;
		}
		return res;
    }
	public static void main(String[] args) {
		int[] arr = {1,2,4};
		maxFrequency(arr,5);
	}
}
