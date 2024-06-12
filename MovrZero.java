package kunal;

public class MovrZero {
	public static void moveZeroes(int[] nums) {
		int snowballSize = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0)
				snowballSize++;
			else if(snowballSize>0) {
				int t = nums[i];
				nums[i-snowballSize] = t;
				nums[i] = 0;
			}
		}
    }
	public static void main(String[] args) {
		int[] arr = {1,2,0,5,0};
		moveZeroes(arr);
	}
}
