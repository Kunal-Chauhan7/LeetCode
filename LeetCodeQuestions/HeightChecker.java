package kunal;

import java.util.Arrays;

public class HeightChecker {
	public int heightChecker(int[] heights) {
		int expected [] =  Arrays.copyOfRange(heights, 0, heights.length);
		Arrays.sort(expected);
		int counter = 0;
		for (int i = 0; i < heights.length; i++) {
			if(heights[i]!=expected[i])
				counter++;
			}
		return counter;
	}
}
