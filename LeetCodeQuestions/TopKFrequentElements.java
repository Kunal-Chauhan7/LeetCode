package kunal;

import java.util.HashMap;
import java.util.PriorityQueue;


public class TopKFrequentElements {
	public int[] topKFrequent(int[] nums, int k) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i : nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
		for(int key : map.keySet()) {
			heap.add(key);
		}
		int[] res = new int[k];
		for(int i = 0; i < k ; i++) {
			res[i] = heap.poll();
		}
		return res;
    }
}
