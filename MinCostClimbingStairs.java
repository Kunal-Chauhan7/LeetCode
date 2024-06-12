package kunal;

public class MinCostClimbingStairs {
	    public int minCostClimbingStairs(int[] cost) {
			int[] dp = new int[cost.length+1];
			for (int i = 0; i < dp.length; i++) {
				dp[i] = -1;
			}
			return Math.min(minCostClimbingStairs(cost,0,dp), minCostClimbingStairs(cost,1,dp));
		}
		public int minCostClimbingStairs(int[] cost,int i,int[] dp) {
		     if(i >= cost.length) {
	            return 0; 
	        }
		    if(dp[i]!=-1)
		    	return dp[i];
		    int cost1 = cost[i]+minCostClimbingStairs(cost,i+1,dp);
		    int cost2 = cost[i]+minCostClimbingStairs(cost,i+2,dp);
		    
		    dp[i] = Math.min(cost1, cost2);
		    return dp[i];
		}
}
