public class luckey_number {
    public static boolean isLucky(int n)
    {
        // Your code here
           int i=2;
        while(n%i!=0){
            if(n/i==0)
            return true;
            int r=n/i;
            n=n-r;
            i++;
        }
        return false;
    }
}
