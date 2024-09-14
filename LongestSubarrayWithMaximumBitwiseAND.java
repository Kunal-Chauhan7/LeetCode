public class LongestSubarrayWithMaximumBitwiseAND{
	public int longestSubarray(int[] nums) {
		int max = Integer.MIN_VALUE;	
		for(int i : nums){
			if(max<i){
				max = i;
			}
		}
		int len = 1;
		int temp_len = 0;
		for(int i : nums){
			if(i==max){
				temp_len++;
			}
			else{
				len = Math.max(len,temp_len);
				temp_len = 0;
			}
		}
		len = Math.max(len,temp_len);
		return len;
    }
}
