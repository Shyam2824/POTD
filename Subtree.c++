class Solution{
public:
    unordered_map<string, int> count;
    string preorder(Node *root, string str = ""){
        // store all the subtrees traversal in children as string.
        string children = "";
        
        for(auto node: root->children){
            // generate individual subtree and store in map(count)        
            string str = preorder(node);
            children+=str;
            count[str]++;
        }
        
        // return root node + all subtrees as preorder traversal
        return to_string(root->data) + children;
        
        
    }
    int duplicateSubtreeNaryTree(Node *root){
        
        preorder(root);
        int ans = 0;
        for(auto it : count){
            if(it.second > 1) ans++;
        }
        return ans;
    }
};