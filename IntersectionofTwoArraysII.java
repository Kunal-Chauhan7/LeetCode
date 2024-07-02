package kunal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectionofTwoArraysII {
	public int[] intersect(int[] nums1, int[] nums2) {
	    boolean nums1BiggerThanNums2 = nums1.length > nums2.length;
	    HashMap<Integer, Integer> map1 = new HashMap<>();
	    HashMap<Integer, Integer> map2 = new HashMap<>();
	    for (int i : nums1) {
	        map1.put(i, map1.getOrDefault(i, 0) + 1);
	    }
	    for (int i : nums2) {
	        map2.put(i, map2.getOrDefault(i, 0) + 1);
	    }
	    
	    ArrayList<Integer> ans = new ArrayList<>();
	    
	    if (nums1BiggerThanNums2) {
	        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
	            int key = entry.getKey();
	            int countInMap1 = entry.getValue();
	            if (map2.containsKey(key)) {
	                int countInMap2 = map2.get(key);
	                int min = Math.min(countInMap1, countInMap2);
	                for (int i = 0; i < min; i++) {
	                    ans.add(key);
	                }
	            }
	        }
	    } else {
	        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
	            int key = entry.getKey();
	            int countInMap2 = entry.getValue();
	            if (map1.containsKey(key)) {
	                int countInMap1 = map1.get(key);
	                int min = Math.min(countInMap1, countInMap2);
	                for (int i = 0; i < min; i++) {
	                    ans.add(key);
	                }
	            }
	        }
	    }
	    int[] finalAns = new int[ans.size()];
	    for (int i = 0; i < ans.size(); i++) {
	        finalAns[i] = ans.get(i);
	    }
	    
	    return finalAns;
	}

}
