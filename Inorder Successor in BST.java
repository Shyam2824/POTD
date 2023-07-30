class Solution{

ArrayList<Node> ar = new ArrayList<>();
           inorder(root, ar);
           int count = 0;
           for(int i = 0 ; i < ar.size() ; i ++){
               if(ar.get(i) == x && i != ar.size()-1) return ar.get(i+1);
           }
           return null;
         }
         static void inorder(Node root, ArrayList<Node> ar){
             if(root == null) return;
             inorder(root.left, ar);
             ar.add(root);
             inorder(root.right, ar);

         }