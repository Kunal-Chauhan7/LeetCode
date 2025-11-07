package kunal;

public class ReverseLinkedListII {
	
	public Node reverseBetween(Node head, int left, int right) {
		Node temp = head;
		Node leftNode = null;
		while(temp.next!=null) {
			if (left == temp.data) {
				leftNode = temp;
				break;
			}
			temp = temp.next;
		}
			Node rightNode = leftNode.next.next;
			Node middle = leftNode.next;
			middle.next = leftNode;
			leftNode.next = rightNode.next;
			rightNode.next = middle;
			return head;
    }
}
