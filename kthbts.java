import java.util.ArrayList;
import java.util.Arrays;

import org.w3c.dom.Node;

public class kthbts {
    class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
        int n = count(root);
        convertArray(root);
        Integer[] arr = new Integer[n];
        arr = nodeArray.toArray(arr);
        Arrays.sort(arr);
        
        return arr[n-K];
    }
    
    ArrayList<Integer> nodeArray = new ArrayList<>();
    
    private void convertArray(Node root){
        if(root == null){
            return;
        }
        
        nodeArray.add(root.data);
        convertArray(root.left);
        convertArray(root.right);
    }
    
    private int count(Node root){
        if(root == null){
            return 0;
        }
        
        return count(root.left) + count(root.right) + 1;
    }
}
}
