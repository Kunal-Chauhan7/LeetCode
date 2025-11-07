package kunal;

import java.util.Arrays;

public class MaximumTotalImportanceofRoads {
	public long maximumImportance(int n, int[][] roads) {
		int[] edgeCount = new int[n];
		for(int i = 0 ; i < roads.length;i++) {
			edgeCount[roads[i][0]]++;
			edgeCount[roads[i][1]]++;
		}
		Arrays.sort(edgeCount);
		int res = 0;
		int label = 1;
		for(int i = 0 ; i < n; i++) {
			res+=label*edgeCount[i];
			label++;
		}
		return res;
    }
}
