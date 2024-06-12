package kunal;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1==null&&l2==null)
			return null;
		ListNode head1 = l1;
		ListNode head2 = l2;
		ListNode head = new ListNode();
		int carry = 0;
		int sum = 0;
		sum = head1.val + head2.val;
		if(sum>=10) {
			sum = sum - 10;
			carry = 1;
		}
		head.val = sum;
		head1 = head1.next;
		head2 = head2.next;
		ListNode temp = head;
		while(head1!=null && head2!=null) {
			sum = head1.val + head2.val + carry;
			if(sum>=10) {
				carry = 1;
				sum = sum - 10;
			}
			else {
				carry = 0;
			}
			
			ListNode newNode = new ListNode();
			newNode.val = sum;
			temp.next = newNode;
			head1 = head1.next;
			head2 = head2.next;
			temp = temp.next;
		}
		
		while(head1!=null) {
			sum = head1.val + carry;
			if(sum>=10) {
				sum = sum - 10;
				carry = 1;
			}
			else {
				carry = 0;	
			}
			ListNode newNode = new ListNode();
			newNode.val = sum;
			temp.next = newNode;
			temp = temp.next;
			head1 = head1.next;
		}
		while(head2!=null) {
			sum = head2.val + carry;
			if(sum>=10) {
					sum = sum - 10;
					carry = 1;
				}
			else {
				carry = 0;
			}
			ListNode newNode = new ListNode();
			newNode.val = sum;
			temp.next = newNode;
			temp = temp.next;
			head2 = head2.next;
		}
		
		 if (carry == 1) {
		        ListNode newNode = new ListNode(carry);
		        temp.next = newNode;
		    }
		return head;
    }
}
