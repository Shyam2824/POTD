import org.w3c.dom.Node;

public class ist {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node ptr = head1;
        Node p = new Node(key);
        if(head1.data >= key){
            p.next = head1;
            return p;
        }
        while(ptr.next!=null && ptr.next.data<=key ){
            ptr = ptr.next;
        }
        p.next= ptr.next;
        ptr.next =p;
        return head1;
    }
}
