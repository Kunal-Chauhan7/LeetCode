package kunal;

public class MinTimeToMakeColorfullRope {
	
	public static int minCost(String colors, int[] neededTime) {
        return minCost(colors, neededTime, 0);
    }
	
	public static int minCost(String colors, int[] neededTime , int startingIndex) {
		if(startingIndex == colors.length()-2)
			if (colors.charAt(startingIndex) == colors.charAt(colors.length()-1)){
				return Math.min(neededTime[startingIndex], neededTime[colors.length()-1]) ;
			}
			else {
				return 0;				
			}
        if(colors.charAt(startingIndex) == colors.charAt(startingIndex+1)) {
        	return Math.min(neededTime[startingIndex], neededTime[startingIndex + 1]) + minCost(colors, neededTime, startingIndex+1);
        }
        else return minCost(colors, neededTime, startingIndex+1);
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,1};
		System.out.println(minCost("aabaa", arr));
	}
}
