import java.util.HashSet;

public class panagram {
    class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0; i<s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i)))
            {
               set.add(Character.toLowerCase(s.charAt(i))); 
            }
        }
    
        if(set.size()==26){
            return true;
        }
        
        return false;
        
    }
}

}
