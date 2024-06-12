package kunal;

import java.util.HashSet;

public class LinkedListCycle {
	
//	public boolean hasCycle(ListNode head) {
//		HashSet<ListNode> arr = new HashSet<ListNode>();
//		ListNode temp = head;
//		while(temp!=null) {
//			if(arr.contains(temp)) {
//				return true;
//			}
//			arr.add(temp);
//			temp=temp.next;
//		}
//		return false;
//    }
	
	public boolean hasCycle(ListNode head) {
		ListNode fast = head; 
		ListNode slow = head;
		while(fast!=null&&fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow)
				return true;
		}
		return false;
    }
	
}
