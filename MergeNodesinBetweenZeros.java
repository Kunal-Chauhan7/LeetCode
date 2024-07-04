package kunal;

public class MergeNodesinBetweenZeros {
	public ListNode mergeNodes(ListNode head) {
        if(head==null)
            return null;
        ListNode temp = head;
        while(temp.val != 0) {
            temp = temp.next;
        }
        temp = temp.next;
        ListNode ans = new ListNode();
        ListNode newHead = ans;
        int sum = 0;
        while(temp != null) {
            if(temp.val == 0) {
                ans.val = sum;
                sum = 0;
                if (temp.next != null) {
                    ListNode newNode = new ListNode();
                    ans.next = newNode;
                    ans = newNode;
                }
            } else {
                sum += temp.val;
            }
            temp = temp.next;
        }
        return newHead;
    }
}
