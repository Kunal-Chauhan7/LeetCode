package kunal;

public class SortanArray {
	public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
	public void mergeSort(int[] nums , int low , int high) {
		if(low>=high)
			return;
		int mid = low+(high-low)/2;
		mergeSort(nums,low,mid);
		mergeSort(nums, mid+1, high);
		merge(nums, low, mid, high);
	}
	public void merge(int[] nums, int low, int mid, int high) {
	    int[] temp = new int[high - low + 1];
	    int i = low;        
	    int j = mid + 1;    
	    int k = 0;          
	    while (i <= mid && j <= high) {
	        if (nums[i] <= nums[j]) {
	            temp[k++] = nums[i++];
	        } else {
	            temp[k++] = nums[j++];
	        }
	    }
	    while (i <= mid) {
	        temp[k++] = nums[i++];
	    }
	    while (j <= high) {
	        temp[k++] = nums[j++];
	    }
	    for (i = 0; i < temp.length; i++) {
	        nums[low + i] = temp[i];
	    }
	}
}
