import org.w3c.dom.Node;

public class height_bt {
      int height(Node node) 
    {
        // code here 
        if(node==null){
            return 0;
        }
        int l=1+height(node.left);
        int r=1+height(node.right);
        return Math.max(l,r);
    }
}
