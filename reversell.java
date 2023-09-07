public class reversell {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return head;
        if(left== right) return head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        for(int i=1; i< left; i++){
            pre = cur;
            cur = cur.next;
        } 
        int connections = right - left;
        ListNode nex;
        for(int i =0; i < connections; i++){
            nex = cur.next;
            cur. next=nex. next;
            nex.next= pre.next;
            pre.next=nex;
        }
        return dummy.next;
     }
}
