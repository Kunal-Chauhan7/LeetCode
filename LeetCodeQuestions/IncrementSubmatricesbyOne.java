package kunal;

import java.util.Arrays;

public class IncrementSubmatricesbyOne {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] ans = new int[n][n];
        for(int[] arr : ans){
            Arrays.fill(arr,0);
        }
        for(int[] arr : queries){
            int rowFrom = arr[0];
            int colFrom = arr[1];
            int rowTill = arr[2];
            int colTill = arr[3];
            for(int row = rowFrom ; row <= rowTill ; row++){
                for(int col = colFrom ; col <= colTill ; col++){
                    ans[row][col]++;
                }
            }
        }
        return ans;
    }

}
