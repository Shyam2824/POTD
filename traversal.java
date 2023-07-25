import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class traversal {
         ArrayList<Integer> list=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        int flag=0;
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> sublist=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node curr=q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                sublist.add(curr.data);
            }
            if(flag==0){
                Collections.reverse(sublist);
                flag=1;
            }
            else{
                flag=0;
            }
            for(int i=0;i<sublist.size();i++){
                list.add(sublist.get(i));
            }
        }
        return list;

}
