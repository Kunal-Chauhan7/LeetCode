package kunal;

import java.util.Arrays;

public class SpiralMatrixII {
	public int[][] spiralMatrix(int m, int n, ListNode head) {
	    int left = 0, right = n - 1, top = 0, bottom = m - 1;
	    int[][] arr = new int[m][n];
	    for (int[] row : arr) {
	        Arrays.fill(row, -1);
	    }
	    
	    ListNode temp = head;
	    while (temp != null && top <= bottom && left <= right) {
	        // Traverse from left to right
	        for (int i = left; i <= right; i++) {
	            if (temp == null) return arr;
	            arr[top][i] = temp.val;
	            temp = temp.next;
	        }
	        top++;
	        
	        // Traverse from top to bottom
	        for (int i = top; i <= bottom; i++) {
	            if (temp == null) return arr;
	            arr[i][right] = temp.val;
	            temp = temp.next;
	        }
	        right--;
	        
	        // Traverse from right to left
	        for (int i = right; i >= left; i--) {
	            if (temp == null) return arr;
	            arr[bottom][i] = temp.val;
	            temp = temp.next;
	        }
	        bottom--;
	        
	        // Traverse from bottom to top
	        for (int i = bottom; i >= top; i--) {
	            if (temp == null) return arr;
	            arr[i][left] = temp.val;
	            temp = temp.next;
	        }
	        left++;
	    }   
	    return arr;
	}
}
