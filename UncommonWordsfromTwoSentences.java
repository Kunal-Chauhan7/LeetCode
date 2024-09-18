package kunal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UncommonWordsfromTwoSentences {
	public String[] uncommonFromSentences(String s1, String s2) {
		String[] str1 = s1.split(" ");
		String[] str2 = s2.split(" ");
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		ArrayList<String> ans = new ArrayList<>();
		for(String s : str1) {
			map1.put(s, map1.getOrDefault(s, 0)+1);
		}
		for(String s : str2) {
			map2.put(s, map2.getOrDefault(s, 0)+1);
		}
		for(Map.Entry<String, Integer> e : map1.entrySet()) {
			if(e.getValue()==1) {
				if(!map2.containsKey(e.getKey())) {
					ans.add(e.getKey());
				}
			}
		}
		for(Map.Entry<String, Integer> e : map2.entrySet()) {
			if(e.getValue()==1) {
				if(!map1.containsKey(e.getKey())) {
					if(!ans.contains(e.getKey())) {
						ans.add(e.getKey());
					}
				}
			}
		}
		String[] finalAns = new String[ans.size()];
		int index = 0;
		for(String s : ans) {
			finalAns[index++] = s;
		}
		return finalAns;
    }
}
