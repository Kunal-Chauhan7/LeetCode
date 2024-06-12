package kunal;

import java.util.HashSet;

public class LargestPositiveIntegerThatExistsWithItsNegitive {
	public static int findMaxK(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		int largestExit = -1;
		for(int i : set) {
			int a = -i;
			if(i>largestExit&&set.contains(a)) {
				largestExit = i;
			}
		}
		return largestExit;
    }
	public static void main(String[] args) {
		int[] arr = {-10,8,6,7,-2,-3};
		System.out.println(findMaxK(arr));
	}
}
