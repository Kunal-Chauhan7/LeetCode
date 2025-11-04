package kunal;

public class MinimumTimetoMakeRopeColorful {
//	public int minCost(String colors, int[] neededTime) {
//	    int ans = 0;
//	    int n = colors.length();
//	    for (int i = 1; i < n; i++) {
//	        if (colors.charAt(i) == colors.charAt(i - 1)) {
//	            int start = i - 1;
//	            while (i < n && colors.charAt(i) == colors.charAt(start)) {
//	                i++;
//	            }
//	            int maxTime = neededTime[start];
//	            int sumTime = 0;
//	            for (int j = start; j < i; j++) {
//	                sumTime += neededTime[j];
//	                if (neededTime[j] > maxTime) {
//	                    maxTime = neededTime[j];
//	                }
//	            }
//	            ans += (sumTime - maxTime);
//	            i--;
//	        }
//	    }
//	    return ans;
//	}

    public int minCost(String colors, int[] neededTime) {
        int prev = 0;
        int time = 0;
        for (int i = 0; i < colors.length() ; i++) {
            if(i>0 && colors.charAt(i) != colors.charAt(i-1)) prev = 0;
            time += Math.min(prev,neededTime[i]);
            prev = Math.max(prev,neededTime[i]);
        }
        return time;
    }
}
