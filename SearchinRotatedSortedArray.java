package kunal;

public class SearchinRotatedSortedArray {
	public int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int mid = 0;
		while(low<=high) {
			mid = low + (high-low);
			if(nums[mid]==target)
				return mid;
			if(nums[low]<=nums[mid]) {
				if(target<nums[mid]&&target>=nums[low])
					high=mid-1;
				else {
					low = mid+1;
				}
			}
			else {
				if(target>nums[mid]&&target<=nums[high])
					low = mid+1;
				else
					high=mid-1;
			}
		}
		return -1;
    }
}
