import java.util.HashMap;

public class r_num {
    class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        HashMap<Character,Integer> h=new HashMap<Character,Integer>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        int c=0;
        for(int i=1;i<str.length();i++){
           Character pr=str.charAt(i-1); 
           Character cu=str.charAt(i); 
           if(h.get(pr)>=h.get(cu)){
               c+=h.get(pr);
           }
           else{
               c-=h.get(pr);
           }
        }
        Character r=str.charAt(str.length()-1);
        c+=h.get(r);
        return c;
    }
}
}
