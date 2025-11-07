package kunal;

public class MinimumSwapstoGroupAll1sTogetherII {
	public static int minSwaps(int[] nums) {
		int x =  0;
		int NumberOfOnes = 0;
		int n = nums.length;
		int onesInWindow = 0;
		for(int i : nums)
			if(i==1)NumberOfOnes++;
		int[] newarr = new int[n*2];
		for(int i = 0 ; i < n * 2;i++) {
			newarr[i] = nums[i%n];
		}
		for(int i = 0 ; i < n*2 ; i++) {
			if(i>=NumberOfOnes&&newarr[i-NumberOfOnes]==1)x--;
			if(newarr[i]==1)x++;
			onesInWindow = Math.max(x, onesInWindow);
		}
		return NumberOfOnes-onesInWindow;
    }
	public static void main(String[] args) {
		int[] arr = {1,1,0,0,1};
		System.out.println(minSwaps(arr));
	}
}
