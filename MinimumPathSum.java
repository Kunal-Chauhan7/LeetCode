package kunal;

public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		return minPathSum(grid, 0, 0, m, n);
    }
	public int minPathSum(int[][] arr ,int i ,int j ,int m ,int n) {
		if(i==m-1&&j==n-1)
			return arr[i][j];
		if(i>=m||j>=n)
			return Integer.MAX_VALUE;
		int opt1 = minPathSum(arr, i+1, j, m, n);
		int opt2 = minPathSum(arr, i+1, j+1, m, n);
		int opt3 = minPathSum(arr, i, j+1, m, n);
		
		return arr[i][j] + Math.min(opt1, Math.min(opt2, opt3));
	}
}
