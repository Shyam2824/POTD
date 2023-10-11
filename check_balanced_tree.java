import org.w3c.dom.Node;

public class check_balanced_tree {
    boolean isBalanced(Node root)
    {
    // Your code here
        if(root == null) return true;
    
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        int diff = Math.abs(leftHeight - rightHeight);
        if(diff > 1) return false;
        
        
        
        return isBalanced(root.right) && isBalanced(root.left);
        
        
    }
    
    public static int getHeight(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
