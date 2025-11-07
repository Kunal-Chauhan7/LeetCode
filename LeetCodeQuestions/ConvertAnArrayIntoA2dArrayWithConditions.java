package kunal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertAnArrayIntoA2dArrayWithConditions {

	public static List<List<Integer>> findMatrix(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < nums.length ; i++) {
			int element = nums[i];
			if(map.containsKey(element)) {
				int value = map.get(element);
				value++;
				map.put(element, value);
			}
			else {
				map.put(element, 1);
			}
		}
		boolean valuesgreaterThanzero = true;
		while(valuesgreaterThanzero) {
			ArrayList<Integer> ans2 = new ArrayList<>();
			valuesgreaterThanzero = false;
			for(Map.Entry<Integer, Integer>e:map.entrySet()) {
				int key = e.getKey();
				int value = e.getValue();
				if(value>0) {
					ans2.add(key);
					value--;
					map.put(key, value);
					valuesgreaterThanzero = true;
				}
				
			}
			if(ans2.isEmpty()) {
				continue;
			}
			else {
				ans.add(ans2);				
			}
		}
		return ans;
    }
	public static void main(String[] args) {
		int[] arr = {2,1,1};
		List<List<Integer>> ans = findMatrix(arr);
		for (int i = 0; i < ans.size(); i++) {
			for (int j = 0; j < ans.get(i).size(); j++) {
				System.out.print(ans.get(i).get(j));
			}
			System.out.println();
		}
	}
}
