package kunal;

public class SplitLinkedListinParts {
	public ListNode[] splitListToParts(ListNode head, int k) {
	    int length = 0;
	    ListNode temp = head;
	    while (temp != null) {
	        length++;
	        temp = temp.next;
	    }
	    int size = length / k;
	    int extra = length % k;

	    ListNode[] ans = new ListNode[k];
	    temp = head;  
	    for (int i = 0; i < k; i++) {
	        ans[i] = temp;
	        int currentPartSize = size + (extra > 0 ? 1 : 0);
	        extra--;
	        for (int j = 0; j < currentPartSize - 1 && temp != null; j++) {
	            temp = temp.next;
	        }
	        if (temp != null) {
	            ListNode nextPart = temp.next;
	            temp.next = null;
	            temp = nextPart;
	        }
	    }
	    return ans;
	}
}
