package kunal;

import java.util.LinkedHashMap;
import java.util.Map;

public class KthDistinctStringinanArray {
	public String kthDistinct(String[] arr, int k) {
		if(k==0)return"";
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for(String i : arr) {
			if(!map.containsKey(i))
				map.put(i,1);
			else
				map.put(i, map.get(i)+1);
		}
		for(Map.Entry<String, Integer>e:map.entrySet()) {
			if(e.getValue()==1)
				k--;
			if(k==0)
				return e.getKey();
		}
		return "";
    }
}
