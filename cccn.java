public class cccn {
    class Solution
{
    String colName (long n)
    {
        String s = "";
        
        while(n > 0){
           long nu = (n - 1) % 26;
            String a = Character.toString((char) ('A' + nu));
            s = a + s;
            n = (n - 1) / 26;

        }
        return s;
    }
}
}
