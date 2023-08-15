import java.util.List;

import javax.swing.plaf.ListUI;

public class Partition List {
   class Solution {
  /**
 * @param head
 * @param x
 * @return
 */
public ListUI partition(ListNode head, int x) {
    List beforeHead = new ListNode(0);
    ListNode afterHead = new ListNode(0);
    ListNode before = beforeHead;
    ListNode after = afterHead;

    for (; head != null; head = head.next)
      if (head.val < x) {
        before.next = head;
        before = head;
      } else {
        after.next = head;
        after = head;
      }

    after.next = null;
    before.next = afterHead.next;

    return beforeHead.next;
  }
}
 
}
