import org.w3c.dom.Node;

public class pairwise {
    public Node pairwiseSwap(Node head)
    {
        // code here
        if(head==null || head.next==null)
        {
            return head;
        }
        Node p=head;
        Node c=head.next;
        head=c;
        while(true){
            Node next=c.next;
            c.next=p;
            if(next==null || next.next==null)
            {
                p.next=next;
                break;
                
            }
            p.next=next.next;
            p=next;
            c=p.next;
            }
            return head;
        }
        
    }
}
