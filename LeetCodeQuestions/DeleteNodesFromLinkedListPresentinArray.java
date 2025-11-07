package kunal;

import java.util.HashSet;

public class DeleteNodesFromLinkedListPresentinArray {
	public ListNode modifiedList(int[] nums, ListNode head) {
		if(head==null)
			return null;
		HashSet<Integer> set = new HashSet<>();
		for(int i : nums) {
			set.add(i);
		}
		ListNode newHead = null;
		ListNode temp = head;
		ListNode temp2 = null;
		while(temp!=null) {
			int val = temp.val;
			if(!set.contains(val)) {
				ListNode newNode = new ListNode(val);
				if(newHead==null) {
					newHead = newNode;
					temp2 = newHead;
				}
				else {
					temp2.next = newNode;
					temp2 = temp2.next;
				}
			}
			temp = temp.next;
		}
		return newHead;
    }
}
