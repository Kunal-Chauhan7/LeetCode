package kunal;

public class ReverseNodesinkGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
		if(head==null||k==1||head.next==null)
			return head;
		ListNode begin;
		ListNode dummyHead = new ListNode(-1);
		dummyHead.next = head;
		begin = dummyHead;
		int i = 0;
		while(head!=null) {
			i++;
			if(i%k==0){
				begin = reverse(begin, head.next);
				head = begin.next;
			}
			else {
				head = head.next;
			}
		}
		return dummyHead.next;
	}
	public ListNode reverse(ListNode begin, ListNode end){
		ListNode curr = begin.next;
		ListNode next, first;
		ListNode prev = begin;
		first = curr;
		while (curr!=end){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		begin.next = prev;
		first.next = curr;
		return first;
	}
}
