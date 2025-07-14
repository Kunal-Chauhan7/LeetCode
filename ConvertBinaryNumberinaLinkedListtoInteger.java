package kunal;

public class ConvertBinaryNumberinaLinkedListtoInteger {

    public int getDecimalValue(ListNode head) {
        String binaryNumber = "";
        ListNode temp = head;
        if(temp == null) return 0;
        while(temp!=null){
            binaryNumber += temp.val + "";
            temp = temp.next;
        }
        return Integer.valueOf(binaryNumber,2);
    }

}
