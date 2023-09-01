import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.w3c.dom.Node;

class Tree
{
    public static void printCorner(Node node)
    {
       //USING LEVEL ORDER TRAVERSAL --
     
     List<Integer> list = new ArrayList<>();
     Queue<Node> pq = new LinkedList<>();   
     
     pq.add(node);
     
     while(!pq.isEmpty()){
         List<Integer> temp = new ArrayList<>();
         int n = pq.size();
         
         while(n > 0){
             n--;
             Node nd = pq.poll();
             temp.add(nd.data);
             if(nd.left != null){
                 pq.add(nd.left);
             }
             if(nd.right != null){
                 pq.add(nd.right);
             }
         }
         if(temp.size() == 1){
             list.add(temp.get(0));
         }else{
             list.add(temp.get(0));
             list.add(temp.get(temp.size()-1));
         }
     }
     for(int i = 0 ; i < list.size(); i++){
         System.out.print(list.get(i) + " ");
     }
  
    }
    
}