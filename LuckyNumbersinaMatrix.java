package kunal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersinaMatrix {
	 public static List<Integer> luckyNumbers(int[][] matrix) {
	        int N = matrix.length, M = matrix[0].length;
	        int rMinMax = Integer.MIN_VALUE;
	        for (int i = 0; i < N; i++) {
	            int rMin = Integer.MAX_VALUE;
	            for (int j = 0; j < M; j++) {
	                rMin = Math.min(rMin, matrix[i][j]);
	            }
	            rMinMax = Math.max(rMinMax, rMin);
	        }
	        int cMaxMin = Integer.MAX_VALUE;
	        for (int i = 0; i < M; i++) {
	            int cMax = Integer.MIN_VALUE;
	            for (int j = 0; j < N; j++) {
	                cMax = Math.max(cMax, matrix[j][i]);
	            }
	            cMaxMin = Math.min(cMaxMin, cMax);
	        }
	        if (rMinMax == cMaxMin)
	            return new ArrayList<>(Arrays.asList(rMinMax));
	        return new ArrayList<>();
	    }
	public static void main(String[] args) {
		int[][] arr = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
		System.out.println(luckyNumbers(arr));
	}
}
