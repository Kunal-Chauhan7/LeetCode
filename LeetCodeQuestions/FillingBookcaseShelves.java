package kunal;

import java.util.Arrays;

public class FillingBookcaseShelves {
	public int minHeightShelves(int[][] books, int shelfWidth) {
		int [] dp = new int[books.length];
		Arrays.fill(dp, -1);
		return Solve(0 , books, shelfWidth,dp);
    }
	public int Solve(int index,int[][] books, int shelfWidth,int[] dp) {
		if(index >= books.length)
			return 0;
		if(dp[index]!=-1)
			return dp[index];
		int current_width = 0;
		int max_height  = 0;
		int ans = Integer.MAX_VALUE;
		for(int j = index ; j < books.length ;j++) {
			current_width += books[j][0];
			if(current_width>shelfWidth)break;
			max_height = Math.max(max_height, books[j][1]);
			ans = Math.min(max_height + Solve(j+1, books, shelfWidth,dp),ans);
		}
		return dp[index] = ans;
    }
}
