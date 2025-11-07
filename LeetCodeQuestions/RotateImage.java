package kunal;

public class RotateImage {
	public static void rotate(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i+1; j < matrix[i].length; j++) {
				int temp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] =  temp;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			int left = 0 ;
			int right = matrix[i].length-1;
			while(left<right) {
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = temp;
				left++;
				right--;
				
			}
		}
    }
	public static void main(String[] args) {
		rotate(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
	}
}
