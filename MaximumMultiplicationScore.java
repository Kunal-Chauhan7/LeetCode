package kunal;

public class MaximumMultiplicationScore {
	public long maxScore(int[] a, int[] b) {
	    int k = a.length; 
	    int n = b.length; 
	    long[][] dp = new long[k + 1][n + 1];
	    for (int i = 0; i <= k; i++) {
	        for (int j = 0; j <= n; j++) {
	            dp[i][j] = Long.MIN_VALUE; 
	        }
	    }
	    for (int j = 0; j <= n; j++) {
	        dp[0][j] = 0;
	    }
	    for (int i = 1; i <= k; i++) { 
	        for (int j = i; j <= n; j++) { 
	            dp[i][j] = dp[i][j - 1]; 
	            if (dp[i - 1][j - 1] != Long.MIN_VALUE) {
	                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + a[i - 1] * b[j - 1]);
	            }
	        }
	    }
	    long result = dp[k][n];
	    return result == Long.MIN_VALUE ? 0 : result;
	}

}
