package kunal;

import java.util.Deque;
import java.util.LinkedList;

public class MinimumNumberofkConsecutiveBitFlips {
	public int minKBitFlips(int[] nums, int k) {
		int flips = 0;
		Deque<Integer> q = new LinkedList<>();
		for(int i  = 0 ; i < nums.length ; i++) {
			while(!q.isEmpty()&&q.peekFirst()+k<=i) {
				q.pollFirst();
			}
			if(q.size()%2==nums[i]) {
				if(i+k>nums.length)
					return -1;
				q.add(i);
				flips++;
			}
		}
		return flips;
    }
}
