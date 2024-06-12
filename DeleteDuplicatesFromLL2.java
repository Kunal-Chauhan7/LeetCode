package kunal;

public class DeleteDuplicatesFromLL2 {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode dummy = new ListNode();
		dummy.next = head;
		ListNode prev = dummy;
		while(head.next!=null) {
			if(head.next!=null&&head.val==head.next.val) {
				while(head.next!=null && head.val==head.next.val)
					head = head.next;
				prev.next = head.next;
			}
			else {
				prev = prev.next;
			}
			head = head.next;
		}
		return dummy.next;
    }
}
