class Solution {
    public static int floor(Node root, int x) {
        // Code here
        int floor = -1;
        while(root != null){
            if(root.data < x){
                floor = root.data;
                root = root.right;
            }
            else if(root.data > x){
                root = root.left;
            }
            else{
                return root.data;
            }
        }
        return floor;
    }
}