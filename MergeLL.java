package kunal;

public class MergeLL {
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if(list1==null)
			return list2;
		if(list2==null)
			return list1;
		ListNode head;
		if(list1.val<list2.val) {
			head = list1;
			list1 = list1.next;
		}
		else {
			head = list2;
			list2 = list2.next;
		}
		ListNode n = head;
		while(list1!=null&&list2!=null) {
			if(list1.val<list2.val) {
				n.next = list1;
				list1 = list1.next;
				n = n.next;
			}
			else {
				n.next = list2;
				list2 = list2.next;
				n = n.next;
			}
		}
		if(list1!=null) 
			n.next = list1;
		if(list2!=null)
			n.next = list2;
		return head;
    }
}
