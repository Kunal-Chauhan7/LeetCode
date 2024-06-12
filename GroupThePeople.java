package kunal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class GroupThePeople {
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 0; i < groupSizes.length; i++) {
			int element = groupSizes[i];
			if(!map.containsKey(element)) {
				ArrayList<Integer> arr = new ArrayList<>();
				arr.add(i);
				map.put(element, arr);
			}
			else {
				ArrayList<Integer> arr = map.get(element);
				arr.add(i);
				map.put(element, arr);
			}
		}
		List<List<Integer>> ans = new ArrayList<>();
		for(Map.Entry<Integer, ArrayList<Integer>>e:map.entrySet()) {
			ArrayList<Integer> arr = e.getValue();
			while(!arr.isEmpty()) {
				ArrayList<Integer> minians = new ArrayList<>();
				for (int i = 0; i < e.getKey(); i++) {
					minians.add(arr.get(0));
					arr.remove(0);
				}
				ans.add(minians);
			}
		}
		return ans;
    }
}
