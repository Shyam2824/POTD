class Solution{

    public:
      void helper(int &res,Node* root,int dis,unordered_map<Node*,Node*>&um,unordered_set<Node*>&s,int k){
        if(dis>=k){
            return;
        }
        // parent
        auto it =um.find(root);
        auto papa=it->second;
        if(s.find(papa)==s.end() && papa!=NULL){
            s.insert(papa);
            res=res+papa->data;
            helper(res,papa,dis+1,um,s,k);
        }
        // left
        if(s.find(root->left)==s.end() && root->left!=NULL){
            s.insert(root->left);
            res=res+root->left->data;
            helper(res,root->left,dis+1,um,s,k);
        }
        //right
        if(s.find(root->right)==s.end() && root->right!=NULL){
            s.insert(root->right);
            res=res+root->right->data;
            helper(res,root->right,dis+1,um,s,k);
        }
    }
    int ladoos(Node* root, int home, int k)
    {
        unordered_map<Node*,Node*>um;
        unordered_set<Node*>s;
        // first find that home to call the function;
        queue<Node*>q;
        q.push(root);
        Node* target;
        um[root]=NULL;
        while(q.size()!=0){
            auto t=q.front();
            q.pop();
            if(t->data==home){
                target=t;
            }
            if(t->left!=NULL){
                um[t->left]=t;
                q.push(t->left);
            }
            if(t->right!=NULL){
                um[t->right]=t;
                q.push(t->right);
            }
        }
        int res=0;
        res+=target->data;
        s.insert(target);
        // cout<<res<<endl;
        helper(res,target,0,um,s,k);
        return res;
        
    }


};