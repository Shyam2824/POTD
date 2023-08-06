public class String Permutations {
    public static void helper(ArrayList<String> ans,String s, String str) {
        if(s.length() == 0) {
            ans.add(str);
            return;
        }

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            String newStr = s.substring(0, i) + s.substring(i+1);
            helper(ans, newStr, str+ch);
        }
    }
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> ans = new ArrayList<>();
        helper(ans,S,"");
        Collections.sort(ans);
        return ans;
    }
    
}
