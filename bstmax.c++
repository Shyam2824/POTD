class Solution{
private:
    int solve(Node* root) {
        
        if(root == NULL) {
            return 0;
        }
        
        int left = solve(root -> left);
        int right = solve(root -> right);
        
        if(!root -> left) {
            return root -> data + right;
        }
        else if(!root -> right) {
            return root -> data + left;
        }
        
        return root -> data + min(left, right);
    }

public:
    int maxDifferenceBST(Node *root,int target){
        
        Node* temp = root;
        int sum = 0;
        
        while(temp) {
            if(temp -> data == target) {
                int mini = solve(temp) - target;
                return sum - mini;
            }
            else if(temp -> data < target) {
                sum += temp -> data;
                temp = temp -> right;
            } 
            else {
                sum += temp -> data;
                temp = temp -> left;
            }
        }
        return -1;
    }
};