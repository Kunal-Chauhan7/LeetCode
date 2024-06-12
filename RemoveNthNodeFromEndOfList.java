package kunal;

public class RemoveNthNodeFromEndOfList {
//	public ListNode removeNthFromEnd(ListNode head, int n) {
//		if(head==null)
//			return null;
//		ListNode forward = new ListNode(-1,head);
//		ListNode prevNode = forward;
//		for(int i = 0 ; i < n ; i++)
//			head = head.next;
//		while(head!=null) {
//			head=head.next;
//			prevNode = prevNode.next;
//		}
//		prevNode.next= prevNode.next.next;
//		return forward.next;
//	}
	
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		int length = 0;
		ListNode temp = head;
		while(temp!=null) {
			length++;
			temp = temp.next;
		}
		temp = head;
		int toDel = length - n - 1;
		if(toDel<0)
			return head.next;
		while(toDel>0) {
			temp = temp.next;
			toDel--;
		}
		if(temp.next == null) {
			temp.next = null;
			return head;
		}
		temp.next = temp.next.next;
		return head;
    }
}
