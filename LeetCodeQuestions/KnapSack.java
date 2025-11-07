package kunal;

public class KnapSack {
	
	
	public static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
	    int[][] dp = new int[n + 1][maxWeight + 1];
	    for (int i = 0; i <= n; i++) {
	        for (int j = 0; j <= maxWeight; j++) {
	            dp[i][j] = -1;
	        }
	    }
	    return knapsack(weight, value, n, maxWeight, 0, dp);
	}

	public static int knapsack(int[] weight, int[] value, int n, int maxWeight, int i, int[][] dp) {
	    if (dp[i][maxWeight] != -1)
	        return dp[i][maxWeight];
	    if (i == n - 1) {
	        if (weight[i] > maxWeight) {
	            dp[i][maxWeight] = 0;
	            return 0;
	        } else {
	            dp[i][maxWeight] = value[i];
	            return value[i];
	        }
	    }
	    if (weight[i] > maxWeight) {
	        dp[i][maxWeight] = knapsack(weight, value, n, maxWeight, i + 1, dp);
	        return dp[i][maxWeight];
	    }
	    int op1 = value[i] + knapsack(weight, value, n, maxWeight - weight[i], i + 1, dp);
	    int op2 = knapsack(weight, value, n, maxWeight, i + 1, dp);
	    dp[i][maxWeight] = Math.max(op1, op2);
	    return dp[i][maxWeight];
	}
	
	
	
//	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
//		return knapsack(weights, values, n, maxWeight,0);
//	}
//	
//	public static int knapsack(int[] weights, int[] values, int n, int maxWeight,int i) {
//		if(i==n)
//			return 0;
//		if(weights[i]>maxWeight)
//			return knapsack(weights, values, n, maxWeight, i+1);
//		int op1 = values[i] + knapsack(weights, values, n, maxWeight-weights[i],i+1);
//		int op2 = knapsack(weights, values, n, maxWeight,i+1);
//		return Math.max(op1, op2);
//	}
}
