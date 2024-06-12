package kunal;

import java.util.HashMap;
import java.util.Map;

public class CountElememtWithMaximumFrequency {
	public int maxFrequencyElements(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < nums.length ; i++) {
			if(!map.containsKey(nums[i]))
				map.put(nums[i], 1);
			else {
				int value = map.get(nums[i]);
				value++;
				map.put(nums[i], value);
			}
		}
		int ans = 0;
		int maxFrequency = 1;
		for(Map.Entry<Integer, Integer>e:map.entrySet()) {
			if(e.getValue()>maxFrequency)
				maxFrequency = e.getValue();
		}
		for(Map.Entry<Integer, Integer>e:map.entrySet()) {
			if(e.getValue()==maxFrequency)
				ans+=e.getValue();
		}
		return ans;
	}
}
