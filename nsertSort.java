import org.w3c.dom.Node;

public class nsertSort {
    class Solution
{
    public static Node insertionSort(Node head)
    {
        //code here
        Node dummy = new Node(-1);
        
        while(head != null){
            Node temp = dummy;
            Node next = head.next;
            
            while(temp.next != null && temp.next.data < head.data){
                temp = temp.next;
            }
            head.next = temp.next;
            temp.next = head;
            head = next;
        }
        
        return dummy.next;
    }
}
}
