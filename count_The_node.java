import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import org.w3c.dom.Node;

public class count_The_node {
    class Solution {
    
    int printKDistantfromLeaf(Node root, int k) {
        
        int level = 0, leafCount = 0;
        Set<Integer> leafNodes = new HashSet<>();
        
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            
            int n = q.size();
            level++;
            boolean isLeaf = false;
            
            for(int i=0;i<n;i++) {
                Node node = q.poll();
                
                if(node.left == null && node.right == null) {
                    isLeaf = true;
                    leafCount++;
                }
                
                if(node.left != null) {
                    q.offer(node.left);
                }
                
                if(node.right != null) {
                    q.offer(node.right);
                }
            }
            
            if(isLeaf) {
                leafNodes.add(level-1);
            }
        }
        
        if(k == 0) {
            return leafCount;
        }
        
        int ans = 0;
        for(Integer i : leafNodes) {
            if(i >= k) {
                ans++;
            }
        }
        
        return ans;
    }
}
}
