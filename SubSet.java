package kunal;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		ArrayList<Integer> miniAnswer = new ArrayList<>();
		subsets(nums, ans, miniAnswer , 0);
		return ans;
    }
	public void subsets(int[] nums , List<List<Integer>> ans , ArrayList<Integer> miniAnswer , int index) {
		if(index==nums.length) {
			ans.add(new ArrayList<>(miniAnswer));
			return;
		}
		subsets(nums, ans, miniAnswer, index+1);
		int element = nums[index];
		miniAnswer.add(element);
		subsets(nums, ans, miniAnswer, index+1);
	}
}
