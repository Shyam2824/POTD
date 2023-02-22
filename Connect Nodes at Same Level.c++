class Solution{
    public:
    void connect(Node *root)
    {
       // Code Here
       queue<Node*> q;
       q.push(root);
       while(!q.empty()){
           Node *temp;
           int size = q.size();
           for(int i=0;i<size;i++){
               temp = q.front();
               if(temp->left) q.push(temp->left);
               if(temp->right) q.push(temp->right);
               q.pop();
               temp->nextRight=q.front();
           }
           temp->nextRight = 0;
       }
    }    
};