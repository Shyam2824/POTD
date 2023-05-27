class Solution{
    public:
    struct Node* modifyTheList(struct Node *head)
    {
        //add code here.
         stack<int> st;
        stack<int> st2;
        Node* slow = head;
        Node* slow2 = head;
        Node* fast = head;
        Node* temp = head;
        int cnt=0;
        while(temp!=NULL){
            temp=temp->next;
            cnt++;
        }
        while( fast!=NULL && fast->next!=NULL){
            fast=fast->next->next;
            slow = slow->next;
            slow2 = slow2->next;
        }
        Node* first = head;
        while(first!=slow){
            st2.push(first->data);
            first = first->next;
        }
        if(cnt%2!=0){
            slow=slow->next;
            slow2=slow2->next;
        }
        
        while(slow!=NULL){
            st.push(slow->data);
            slow = slow->next;
        }
        
        Node* ntemp = head;
        
        while(slow2!=NULL){
            ntemp->data = st.top() - ntemp->data;
            slow2->data = st2.top();
            ntemp = ntemp->next;
            slow2 = slow2->next;
            st.pop();
            st2.pop();
        }
        
        return head;
    }
};