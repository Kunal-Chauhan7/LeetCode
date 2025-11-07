package kunal;

import java.util.HashMap;
import java.util.Map;

public class TheTwoSneakyNumbersofDigitville {
	public int[] getSneakyNumbers(int[] nums) {       
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		int[] ans = new int[2];
		int index = 0;
		for(Map.Entry<Integer, Integer>e:map.entrySet()) {
			if(e.getValue()==2)
				ans[index++] = e.getKey();
		}
		return ans;
	}
}
