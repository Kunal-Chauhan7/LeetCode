package kunal;

import java.util.Stack;

public class ReorderList {
//    public void reorderList(ListNode head) {
//        if (head == null || head.next == null) return;
//        Stack<ListNode> st = new Stack<>();
//        ListNode temp = head;
//        ListNode temp2 = head;
//        int numberOfNodes = 0;
//        while(temp!=null){
//            st.push(temp);
//            temp = temp.next;
//            numberOfNodes++;
//        }
//        for (int i = 0; i < numberOfNodes / 2; i++) {
//            ListNode currNext = temp2.next;
//            ListNode stackNode = st.pop();
//            temp2.next = stackNode;
//            stackNode.next = currNext;
//            temp2 = currNext;
//        }
//        temp2.next=null;
//    }

    public void reorderList(ListNode head) {

        if(head==null||head.next==null)return;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow.next;
        ListNode next = null;

        slow.next = null; // divided the Linked list

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        while(head != null && prev != null){
            ListNode t1 = head.next;
            ListNode t2 = prev.next;

            head.next = prev;
            prev.next = t1;

            head = t1;
            prev = t2;
        }

    }

}
