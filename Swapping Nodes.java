public class Swapping Nodes {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode tmp = head;
        int ct = k;
        ListNode res1 = head;
        ListNode res2 = head;
        while(ct>0){
            res1 = tmp;
            tmp = tmp.next;
            ct--;
        }
        // moving temporary pointer k times and the Kth node from the beginning pointer is moved (k-1) times.
        while(tmp!=null){
            tmp = tmp.next;
            res2 = res2.next;
        }
        // moving the temporary and res2 pointer simultaneously.
        
        int temp = res1.val;
        res1.val = res2.val;
        res2.val = temp;
        return head;
    }
}
