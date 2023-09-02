import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class leaf {
    public int getCount(Node node, int bud)
    {
        Queue<Node> q= new LinkedList<Node>();
        ArrayList<Integer> arr= new ArrayList<Integer>();
        int cost=1, count=0, sum=0;

        q.add(node);
       
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0; i<n; i++){
                Node temp=q.poll();
                if(temp.left==null && temp.right==null){
                    arr.add(cost);
                }
                else{
                    if(temp.left!=null){
                        q.add(temp.left);
                    }
                    if(temp.right!=null){
                        q.add(temp.right);
                    }
                }
            }
            cost++;
        }
        
        for(count=0; count<arr.size(); count++){
            sum=sum+arr.get(count);
            if(sum>bud){
                break;
            }
        }
        
        return count;
    }


}
