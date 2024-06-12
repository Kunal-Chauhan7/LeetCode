package kunal;

import java.util.HashMap;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < nums.length ; i++) {
			int element = nums[i];
			if(!map.containsKey(element))
				map.put(element, 1);
			else
				return true;
		}
		return false;
    }
}
