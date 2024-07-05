package kunal;

import java.util.ArrayList;

public class FindtheMinimumandMaximumNumberoffNodesBetweenCriticalPoints {
	public int[] nodesBetweenCriticalPoints(ListNode head) {
	    if (head == null || head.next == null || head.next.next == null) {
	        return new int[] {-1, -1};
	    }
	    ArrayList<Integer> indexList = new ArrayList<>();
	    ListNode temp = head.next;
	    ListNode prev = head;
	    ListNode next = head.next.next;
	    int index = 1;
	    while (next != null) {
	        if ((temp.val < prev.val && temp.val < next.val) || (temp.val > prev.val && temp.val > next.val)) {
	            indexList.add(index);
	        }
	        prev = temp;
	        temp = next;
	        next = next.next;
	        index++;
	    }
	    if (indexList.size() < 2) {
	        return new int[] {-1, -1};
	    }
	    int maximum = indexList.get(indexList.size() - 1) - indexList.get(0);
	    int min = Integer.MAX_VALUE;
	    for (int i = 1; i < indexList.size(); i++) {
	        min = Math.min(min, indexList.get(i) - indexList.get(i - 1));
	    }

	    return new int[] {min, maximum};
	}

}
