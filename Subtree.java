public Subtree {
    HashMap<String,Integer> map = new HashMap<>();
    int ans=0;
    public int duplicateSubtreeNaryTree(Node root){
       
       helper(root);
       
       return ans;
    }
    
    public String helper(Node root){
        if(root==null)
            return "#";
        
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(root.data)+"#");
        
        for(Node neg : root.children){
            String temp=helper(neg);
            sb.append(temp);
        }
        
        String result=sb.toString();
        
        if(map.containsKey(result)==true){
            if(map.get(result)==1)ans++;
            map.put(result,map.get(result)+1);
        }
        else
            map.put(result,1);
        
        return result;
    } 
}
