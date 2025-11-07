package kunal;
public class JumpGameII {
	public static int jump(int[] nums) {
		int destination = nums.length-1;
		int coverage = 0;
		int lastJumpRangeIndex = 0;
		int totalJump = 0;
		for (int i = 0; i < nums.length; i++) {
			coverage = Math.max(coverage, i + nums[i]);
			if(i == lastJumpRangeIndex) {
				totalJump++;
				lastJumpRangeIndex = coverage;
			if(coverage>=destination)
				return totalJump;
			}
		}
		return totalJump;
    }
	public static void main(String[] args) {
		int [] arr = {2,3,1,1,4};
		System.out.println(jump(arr));
	}
}