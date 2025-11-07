package kunal;

public class RemoveDuplicatesFromSortedListII {
	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode curr = head;
		ListNode slow = head;
		ListNode fast = head.next;
		
		
		
		return head;
    }
	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(3);
		ListNode five = new ListNode(4);
		ListNode six = new ListNode(4);
		ListNode seven = new ListNode(5);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		six.next = seven;
		ListNode head = one;
		while(head!=null) {
			System.out.print(head.val+"->");
			head = head.next;
		}
		
		System.out.println();
		ListNode head2 = deleteDuplicates(one);
		while(head2!=null) {
			System.out.print(head2.val+"->");
			head2 = head2.next;
		}
	}
}
