public class Intersection Point in Y Shaped Linked Lists {
    int intersectPoint(Node head1, Node head2)
	{
         // code here
         Node ptr = head1;
         Node qtr = head2;
         int c1 = 0;
         int c2 = 0;
         while(ptr.next!=null)
         {
             ptr = ptr.next;
             c1++;
         }
         while(qtr.next!=null)
         {
             qtr = qtr.next;
             c2++;
         }
         int diff = Math.abs(c1-c2);
         ptr = head1;
         qtr = head2;
         if(c1>c2)
         {
             while(diff>0) 
             {
                ptr = ptr.next;
                diff--;
             }
         }
         else if(c2>c1)
         {
             while(diff>0)
             {
                qtr = qtr.next;
                diff--;
             }
         }
         while(ptr.next!=null && qtr.next!=null)
         {
             if(ptr.next == qtr.next)
             {
                 return ptr.next.data;
             }
             ptr = ptr.next;
             qtr = qtr.next;
         }
        return -1;
	}

}
