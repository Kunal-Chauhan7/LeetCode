package kunal;

import java.util.Arrays;

public class LongestPalindromicSubsequence {
	public static int longestPalindromeSubseq(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        StringBuilder str1 = new StringBuilder(s);
        StringBuilder str2 = new StringBuilder(s).reverse();
        int[][] dp = new int[s.length()][s.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return longestPalindromeSubseq(str1, str2, 0, 0, dp);
    }

    public static int longestPalindromeSubseq(StringBuilder str1, StringBuilder str2, int i, int j, int[][] dp) {
        if (i == str1.length() || j == str2.length()) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (str1.charAt(i) == str2.charAt(j)) {
            dp[i][j] = 1 + longestPalindromeSubseq(str1, str2, i + 1, j + 1, dp);
        } else {
            dp[i][j] = Math.max(longestPalindromeSubseq(str1, str2, i, j + 1, dp),
                               longestPalindromeSubseq(str1, str2, i + 1, j, dp));
        }
        return dp[i][j];
    }
	public static void main(String[] args) {
		System.out.println(longestPalindromeSubseq("bbbab"));
	}
}
