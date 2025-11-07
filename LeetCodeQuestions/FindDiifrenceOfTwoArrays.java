package kunal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDiifrenceOfTwoArrays {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		List<List<Integer>> ans = new ArrayList<>();
		HashMap<Integer, Integer> map1 = new HashMap<>();
		HashMap<Integer, Integer> map2 = new HashMap<>();
		for (int i = 0; i < nums1.length; i++) {
			int num = nums1[i];
			if(!map1.containsKey(num)) {
				map1.put(num, 1);
			}
		}
		for (int i = 0; i < nums2.length; i++) {
			int num = nums2[i];
			if(!map2.containsKey(num)) {
				map2.put(num, 1);
			}
		}
		ArrayList<Integer> ans1 = new ArrayList<>();
		for(Map.Entry<Integer, Integer> e:map1.entrySet()) {
			if(!map2.containsKey(e.getKey())) {
				ans1.add(e.getKey());
			}
		}
		ArrayList<Integer> ans2 = new ArrayList<>();
		for(Map.Entry<Integer, Integer> e:map2.entrySet()) {
			if(!map1.containsKey(e.getKey())) {
				ans2.add(e.getKey());
			}
		}
		ans.add(ans1);
		ans.add(ans2);
		return ans;
    }
}
