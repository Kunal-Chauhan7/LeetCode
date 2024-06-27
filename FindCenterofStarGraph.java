package kunal;

import java.util.HashMap;
import java.util.Map;

public class FindCenterofStarGraph {
	public int findCenter(int[][] edges) {
		HashMap<Integer, Integer>map = new HashMap<>();
		for(int i = 0 ; i < edges.length;i++) {
			for (int j = 0 ; j < edges[i].length;j++) {
					if(!map.containsKey(edges[i][j]))
						map.put(edges[i][j], 1);
					else
						map.put(edges[i][j], map.get(edges[i][j])+1);
			}
		}
		for(Map.Entry<Integer, Integer>e:map.entrySet()) {
			if(e.getValue()==edges.length)
				return e.getKey();
		}
		return -1;
    }
}
