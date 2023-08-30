import org.w3c.dom.Node;

class GfG
{
    Node deleteNode(Node head, int x)
    {
// Your code here
   if (x <= 0) return head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node current = dummy;
        for (int i = 0; i < x - 1 && current.next != null; i++) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
        return dummy.next;
    }
}