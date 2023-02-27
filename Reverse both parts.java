class Solution {
    public static Node reverse(Node head, int k) {
        // code here
                if(head==null || head.next==null)
            return head;
            
        if(k==0)
            return reverse(head);
            
        Node temp=head;
        int count=1;
        
        while(temp!=null){
            if(count==k)    
                break;
            count++;
            temp=temp.next;
        }
        
        Node first=head;
        Node second=temp.next;
        temp.next=null;
        
        first=reverse(first);
        second=reverse(second);
        
        Node ans=first;
        while(first.next!=null)
            first=first.next;
            
        first.next=second;
        
        return ans;
    }
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
        
