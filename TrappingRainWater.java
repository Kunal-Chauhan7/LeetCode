package kunal;

public class TrappingRainWater {
	public int trap(int[] height) {
		int n = height.length;
		int[] leftToRightArr = new int[n];
		int[] RightToLeftArr = new int[n];
		leftToRightArr[0] = height[0];
		for(int i = 1 ; i < n ; i++) {
			leftToRightArr[i] = Math.max(height[i], leftToRightArr[i-1]);
		}
		RightToLeftArr[n-1] = height[n-1];
		for(int j=n-2; j>=0 ; j--) {
			RightToLeftArr[j] = Math.max(RightToLeftArr[j+1], height[j]);
		}
		int ans = 0;
		for(int i = 0 ; i < n ;i++) {
			ans += Math.min(leftToRightArr[i], RightToLeftArr[i]) - height[i];
		}
		return ans;
    }
}
