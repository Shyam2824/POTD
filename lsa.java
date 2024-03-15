import java.util.ArrayList;
import java.util.Collections;

import org.w3c.dom.Node;

public class lsa {
    public Node sort(Node head){
        ArrayList<Integer> values = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            values.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(values);
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.data = values.get(i++);
            temp = temp.next;
        }

        return head;
   }
}
