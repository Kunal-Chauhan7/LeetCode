package kunal;

public class EditDistance {
	public int minDistance(String word1, String word2) {
		int[][] dp = new int[word1.length()+1][word2.length()+1];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				dp[i][j] = -1;
			}
		}
		return minDistance(word1, word2, dp);
    }
	public int minDistance(String word1, String word2, int[][] dp) {
		int m = word1.length();
		int n = word2.length();
		if(dp[m][n]!=-1)
			return dp[m][n];
		if(m==0) {
			dp[m][n] = n;
			return dp[m][n];
		}
		if(n==0) {
			dp[m][n] = m;
			return dp[m][n];
		}
		if(word1.charAt(0)==word2.charAt(0)) {
			dp[m][n] = minDistance(word1.substring(1), word2.substring(1), dp);
			return dp[m][n];
		}
		else {
			int opt1 = minDistance(word1, word2.substring(1), dp);
			int opt2 = minDistance(word1.substring(1), word2, dp);
			int opt3 = minDistance(word1.substring(1), word2.substring(1), dp);
			dp[m][n] = 1 + Math.min(opt1, Math.min(opt2, opt3));
		}
		return dp[m][n];
	}
}
