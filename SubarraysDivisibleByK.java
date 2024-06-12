package kunal;

public class SubarraysDivisibleByK {
	public static int subarraysDivByK(int[] nums, int k) {
		return subarraysDivByK(nums, k, 0);
    }
	public static int subarraysDivByK(int[] nums, int k , int index) {
		if(index==nums.length)
			return 0;
		int sum = 0;
		int count = 0;
		for(int i = index ; i < nums.length ; i++) {
			sum+=nums[i];
			if(sum%k==0)
				count++;
		}
		return count + subarraysDivByK(nums, k, index+1);
	}
	public static void main(String[] args) {
		int [] arr = {4,5,0,-2,-3,1};
		System.out.println(subarraysDivByK(arr, 5));
	}
}
