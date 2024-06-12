package kunal;

import java.util.Arrays;

public class NumberOfDiceRollsWithTargetSum {
    final int mod = (int) Math.pow(10, 9) + 7;
	public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target+1];
        for(int[] d: dp) {
        	Arrays.fill(d, -1);
        }
        return numRollsToTarget(n, k, target, dp);
    }
	public int numRollsToTarget(int n, int k, int target, int[][]dp) {
        if(n==0&&target==0)return 1;
        if(n==0||target<=0)return 0;
        if(dp[n][target]!=-1) return dp[n][target];
        int ways = 0;
        for (int i = 1; i <= k; i++) {
        	ways = (ways + numRollsToTarget(n-1, k, target-i, dp))%mod;
		}
        dp[n][target] = ways%mod;
        return dp[n][target];
    }
}
