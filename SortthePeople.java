package kunal;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortthePeople{
	public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> treemap = new TreeMap<Integer, String>(Collections.reverseOrder());
        for(int i = 0 ; i < heights.length ;i++) {
        	treemap.put(heights[i], names[i]);
        }
        String[] ans = new String[heights.length];
        int i = 0;
        for(Entry<Integer, String> e:treemap.entrySet()) {
        	ans[i++] = e.getValue();
        }
        return ans;
    }
	public static void main(String[] args) {
		String[] names = {"Mary","John","Emma"};
		int [] heights = {180,165,170};
		sortPeople(names, heights);	
	}
}