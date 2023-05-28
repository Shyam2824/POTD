
class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	int count=0;
        Node temp=head;
        
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        
        temp=head;
        
        if((count-n)<0)
        {
            return -1;
        }
        for(int i=0;i<count-n;i++)
        {
            temp=temp.next;
        }
        
        return temp.data;
    }
}
