package kunal;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementinanArray {
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		for(int i : nums) {
			q.add(i);
		}
		int ans = 0;
		while(k!=0) {
			ans = q.poll();
			k--;
		}
		return ans;
    }
}
