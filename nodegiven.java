import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class nodegiven {
    class Solution
{
   static Node tar;
   
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        // return the sorted list of all nodes at k dist
        ArrayList<Integer> ans = new ArrayList<>();
        
        Queue<Node> q1 = new LinkedList<>();
        
        Queue<Node> q2 = new LinkedList<>();
        
        HashMap<Node,Node> hs_Parent= new HashMap<>();
        
        HashMap<Node,Boolean> isVisited = new HashMap<>();
        int dist=0;
        
        q1.add(root);
        hs_Parent.put(root,root);
        while(!q1.isEmpty()){
            Node curr = q1.poll();
            
            if(curr.left!=null){
                q1.add(curr.left);
                hs_Parent.put(curr.left,curr);
            }
            if(curr.right!=null){
                q1.add(curr.right);
                hs_Parent.put(curr.right,curr);
            }
        }
        
        getTarget(root,target);
        
        q2.offer(tar);
        
        isVisited.put(tar,true);
        
        while(!q2.isEmpty()){
            if(dist==k) break;
            dist++;
            
            int size= q2.size();
            
            for(int i=0;i<size; i++){
             Node curr= q2.poll();
             if(curr.left!=null&& isVisited.get(curr.left)==null){
                isVisited.put(curr.left,true);
                q2.offer(curr.left);
               
            }
            if(curr.right!=null && isVisited.get(curr.right)==null){
                isVisited.put(curr.right,true);
                q2.offer(curr.right);
                }
            
            
            if(isVisited.get(hs_Parent.get(curr))==null){
                q2.offer(hs_Parent.get(curr));
                isVisited.put(hs_Parent.get(curr),true);
            }
          }
        }
          
        while(!q2.isEmpty()){
            Node curr = q2.poll();
            ans.add(curr.data);
        }
        Collections.sort(ans);
        return ans;
        
    }
    public static void getTarget(Node root, int target){
        if(root==null){
            return ;
        }
        if(root.data==target){
            tar= root;
            return;
        }
        getTarget(root.left,target);
        getTarget(root.right,target);
    }
};
}
