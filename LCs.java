package kunal;

public class LCs {
	public static int lcs(String s, String t) {
		int m = s.length();
		int n = t.length();
		int dp[][] = new int[m+1][n+1];
		for (int i = 0; i <= m; i++) {
			dp[0][i] = 0;
		}
		for (int i = 0; i <= n; i++) {
			dp[i][0] = 0;
		}
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if(s.charAt(m-1)==t.charAt(n-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else {
					dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		return dp[m][n];
		
		
//		int[][] dp = new int[s.length()+1][t.length()+1];
//		for (int i = 0; i <= dp.length; i++) {
//			for (int j = 0; j <= dp[0].length; j++) {
//				dp[i][j] = -1;
//			}
//		}
//		return lcs(s, t, 0, 0,dp);
    }
//	public static int lcs(String s, String t,int i , int j , int[][]dp) {
//		
//		if(i==s.length()||j==t.length()) {
//			dp[i][j] = 0;
//			return dp[i][j];
//		}
//		if(dp[i][j]!=-1) {
//			return dp[i][j];
//		}
//		if(s.charAt(i)==t.charAt(j))
//			dp[i][j] = 1 + lcs(s, t, i+1, j+1, dp);
//		else {
//			int opt2 = lcs(s, t, i+1, j, dp);
//			int opt3 = lcs(s, t, i, j+1, dp);
//			dp[i][j] = Math.max(opt2, opt3);
//		}
//		return dp[i][j];
//    }
//	public static int lcs(String s, String t) {
//		return lcs(s, t, 0, 0);
//    }
//	public static int lcs(String s, String t,int i , int j) {
//		if(i==s.length()||j==t.length())
//			return 0;
//		int opt1 = 0;
//		if(s.charAt(i)==t.charAt(j)) {
//			opt1 = 1 + lcs(s, t, i+1, j+1);
//		}
//		int opt2 = lcs(s, t, i, j+1);
//		int opt3 = lcs(s, t, i+1, j);
//		int opt4 = lcs(s, t, i+1, j+1);
//		
//		return Math.max(opt1,Math.max(opt2,Math.max(opt3,opt4)));
//    }
}
