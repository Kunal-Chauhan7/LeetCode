package kunal;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i:nums) {
			if(!map.containsKey(i))
				map.put(i, 1);
			else
				map.put(i, map.get(i)+1);
		}
		for(Map.Entry<Integer, Integer>e:map.entrySet()) {
			if(e.getValue()==1)
				return e.getKey();
		}
		return -1;
    }
	public static void main(String[] args) {
		int [] ans = {4,1,2,1,2};
		System.out.println(singleNumber(ans));
	}
}
