import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String Permutations {
    public static void helper(ArrayList<String> ans,String s, java.lang.String string) {
        if(s.length() == 0) {
            ans.add(string);
            return;
        }

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            String newStr = s.substring(0, i) + s.substring(i+1);
            helper(ans, newStr, string+ch);
        }
    }
    private int length() {
        return 0;
    }
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> ans = new ArrayList<>();
        helper(ans,S,"");
        Collections.sort((List<T>) ans);
        return ans;
    }
    
}
