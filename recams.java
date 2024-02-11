class Solution{
    static ArrayList recamanSequence(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        
        for(int i = 1; i < n; i++){
            int cv = ans.get(i - 1) - i;
            if(cv > 0 && ans.contains(cv) == false){
                ans.add(cv);
            } else{
                ans.add(ans.get(i - 1) + i);
            }
        }
        
        return ans;
    }
}