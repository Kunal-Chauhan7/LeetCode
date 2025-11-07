package kunal;

public class Searcha2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		 if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			 return false;
		for (int[] i : matrix) {
			if(i[0] <= target && i[i.length-1] >= target) {
				return BinarySearch(i, target);
			}
		}
		return false;
    }
	public boolean BinarySearch (int[] arr , int target) {
		int low = 0;
		int high = arr.length - 1;
		while(low<=high) {
			int mid = low + (high-low) / 2;
			if(arr[mid]>target)
				high = mid - 1;
			else if(arr[mid]<target)
				low = mid + 1;
			else
				return true;
		}
		return false;
	}
}
