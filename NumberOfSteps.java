package kunal;

public class NumberOfSteps {
	
	public static int countMinStepsToOne(int n) {
//		int [] dp = new int[n+1];
//		for(int i = 0 ; i <= n ; i++) {
//			dp[i] = -1;
//		}
//		return countMinStepsToOne(n, dp);
		
		// tabulation method 
		int[] dp = new int[n+1];
		dp[1] = 0;
		for(int i = 2 ; i <= n ; i++) {
			int min = dp[i-1];
			if(i%3==0) {
				if(min > dp[i/3])
					min = dp[i/3];
			}
			if(i%2==0) {
				if(min > dp[i/2])
					min = dp[i/2];
			}
			dp[i] = min + 1 ;
		}
		return dp[n];
	}
	
//	public static int countMinStepsToOne(int n, int[] dp) {
//		if(dp[n]!=-1) {
//			return dp[n];
//		}
//		int min = Integer.MAX_VALUE;
//		if(n==1) {
//			dp[n] = 0;
//			return dp[n];
//		}
//		int opt1 = countMinStepsToOne(n-1, dp);
//		if (opt1<min)
//			min = opt1;
//		if(n%3==0) {
//			int opt2 = countMinStepsToOne(n/3, dp);
//			if(min<opt2)
//				min = opt2;
//		}
//		if(n%2==0) {
//			int opt3 = countMinStepsToOne(n/2, dp);
//			if(opt3<min)
//				min = opt3;
//		}
//		dp[n] = 1 + min;
//		return dp[n];
//	}
	
	
//	public static int numberOfSteps(int num) {
//		if(num==0)
//			return 0;
//		if(num%2==0) {
//			return 1 + numberOfSteps(num/2);
//		}
//		else
//			return 1 + numberOfSteps(num-1);
//    }
	public static void main(String[] args) {
		System.out.println(countMinStepsToOne(12));
	}
}
