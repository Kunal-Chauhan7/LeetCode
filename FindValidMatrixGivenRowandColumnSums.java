package kunal;

public class FindValidMatrixGivenRowandColumnSums {
	public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
		int[][] ans = new int[rowSum.length][colSum.length];
		for(int i = 0 ; i < rowSum.length ; i++) {
			ans[i][0] = rowSum[i];
		}
		for (int i = 0 ; i < colSum.length;i++) {
			int currentColSum = 0;
			for(int j = 0 ; j < rowSum.length;j++) {
				currentColSum +=ans[j][i]; 
			}
			int j = 0;
			while(currentColSum > colSum[i]) {
				int diff = currentColSum - colSum[i];
				int toShift = Math.min(diff, ans[j][i]);
				ans[j][i] -= toShift;
				ans[j][i+1] += toShift;
				currentColSum -= toShift;
				j++;
			}
		}
		return ans;
    }

}
