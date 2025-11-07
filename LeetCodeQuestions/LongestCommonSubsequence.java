package kunal;

public class LongestCommonSubsequence {
	public static int longestCommonSubsequence(String text1, String text2) {
		int m = text1.length();
		int n = text2.length();
		int[][] dp = new int[m+1][n+1];
		for (int i = 1; i <=m; i++) {
			for (int j = 1; j <= n; j++) {
				dp[i][j] = -1;
			}
		}
		return longestCommonSubsequenceHelper(text1, text2 , m , n , dp);
    }
	public static int longestCommonSubsequenceHelper(String text1, String text2 , int m ,int n , int[][]dp) {
	    if(m == 0 || n == 0)
	    	return 0;
	    if(dp[m][n]!=-1)
	    	return dp[m][n];
	    if(text1.charAt(m-1)==text2.charAt(n-1))
	    	return dp[m][n] = 1 + longestCommonSubsequenceHelper(text1, text2, m-1, n-1, dp);
	    else {
	    	return dp[m][n] = Math.max(longestCommonSubsequenceHelper(text1, text2, m-1, n, dp),longestCommonSubsequenceHelper(text1, text2, m, n-1, dp));
	    }
	}

	public static void main(String[] args) {
		System.out.println(longestCommonSubsequence("pmjghexybyrgzczy", "pmjghexybyrgzczy"));
	}
}
