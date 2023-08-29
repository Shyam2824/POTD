import org.w3c.dom.Node;

class Solution
{
    Node compute(Node head)
    {
        // your code here
         Node temp=head.next;
         //set the head element first because it will be the greatest one
        while(temp!=null){
            if(temp.data>head.data)
                head=temp;
            else temp=temp.next;    
        }
        temp=head;
        //each time we will find the rest largest
        while(temp.next!=null){
            Node max=temp.next;
            Node x=max.next;
            while(x!=null){
                if(x.data>max.data)
                    max=x;
                else x=x.next;    
            }
            temp.next=max;
            temp=max;
        }
        return head;
    }
}
  