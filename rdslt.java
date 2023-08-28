class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	    Node temp = head;
	    while(temp != null){
	        Node curtemp = temp;
	        int prevdata = temp.data;
	        while(curtemp != null && curtemp.data == prevdata){
	            curtemp=curtemp.next;
	        }
	        temp.next = curtemp;
	        temp = temp.next;
	    }
	    return head;
    }
}