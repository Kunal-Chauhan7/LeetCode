package kunal;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
	public static int[] maxSlidingWindow(int[] nums, int k) {
	    if(nums.length == 0 || nums.length == 1 || k <= 0) {
	        return nums;
	    }
	    int n = nums.length;
	    int[] ans = new int[n-k+1];
	    int index = 0;
	    Deque<Integer> q = new LinkedList<>();
	    for(int i = 0; i < n; i++) {
	        while(!q.isEmpty() && q.peek() == i-k) {
	            q.poll();
	        }
	        while(!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
	            q.pollLast();
	        }
	        q.offer(i);
	        if(i >= k-1) {
	            ans[index++] = nums[q.peek()];
	        }
	    }
	    return ans;
	}
}
