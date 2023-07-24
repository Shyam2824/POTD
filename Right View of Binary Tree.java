public class Right View of Binary Tree {
            ArrayList<Integer>list=new ArrayList<>();
        if(node==null) return list;
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        q.add(null);
        int temp=0;
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                list.add(temp);
                if(q.isEmpty()) break;
                else q.add(null);
            }else{
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                temp=curr.data;
            }
            
        }
        return list;
}
