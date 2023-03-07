public class Binary Tree {
    
        public int maxLevelSum(Node root) {
            // add code here.
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            int sum = 0 , maxSum = Integer.MIN_VALUE;
            while(!q.isEmpty()){
                Node curr = q.remove();
                if(curr == null){
                    maxSum = Math.max(maxSum,sum);
                    sum = 0;
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    sum += curr.data;
                    if(curr.left != null)
                    q.add(curr.left);
                    if(curr.right != null)
                    q.add(curr.right);
                }
            }
            return maxSum;
        }
    
}
