import org.w3c.dom.Node;

public class insert_bts {
    class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int key) {
        // your code here
        if(root==null)
        return new Node(key);
        
        if(root.data<key){
            root.right= insert(root.right,key);
        }
        else if(root.data>key)
        {
        root.left=insert(root.left,key);
       
        }
        return root;
    }
}
}
