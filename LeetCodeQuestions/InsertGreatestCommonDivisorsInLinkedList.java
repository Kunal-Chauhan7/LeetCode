package kunal;

public final class InsertGreatestCommonDivisorsInLinkedList {
	static int gcd(int a, int b)
    {
        int i;
        if (a < b)
            i = a;
        else
            i = b;
        for (; i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }
	public ListNode insertGreatestCommonDivisors(ListNode head) {
		ListNode temp = head;
		while(temp.next!=null) {
			int value = temp.val;
			int value2 = temp.next.val;
			int ansToAdd = gcd(value, value2);
			ListNode newNode = new ListNode(ansToAdd);
			newNode.next = temp.next;
			temp.next = newNode;
			temp = temp.next.next;
		}
		return head;
    }
	public static void main(String[] args) {
		System.out.println(gcd(30, 20));
	}
}
