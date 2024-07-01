package kunal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        subsetsWithDup(nums, new ArrayList<>(), 0, ans);
        return ans;
    }

    public void subsetsWithDup(int[] nums, List<Integer> curr, int index, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(curr));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue; 
            curr.add(nums[i]);
            subsetsWithDup(nums, curr, i + 1, ans);
            curr.remove(curr.size() - 1);
        }
    }
}
