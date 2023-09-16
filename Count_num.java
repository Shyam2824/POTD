public class Count_num {
    class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        // add your code here
        int m=1000000007;
        long a=1,b=2,c=4;
        long d=0;
        if(n==1) return a;
        if(n==2) return b;
        if(n==3) return c;
        for(int i=4;i<=n;i++){
            d=(((a%m+b%m)%m)%m+c)%m;
            a=b;
            b=c;
            c=d;
        }
        return d%m;
    }
    
}


}
