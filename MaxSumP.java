public class MaxSumP {
    class Solution
{
    public int maxSum(int n) 
    { 
        //code here.
        return maxS(n);

    } 
    public int maxS(int n){
        if(n<=11){
            return n;
        }
        int sum1 = 0; 
        int sum2 = 0 ;
        sum1 = n/2 + n/3 + n/4;
        sum2 = maxS(n/2) + maxS(n/3)+maxS(n/4);
        int t = Math.max(sum1,sum2);
        return t;
    }
}
}
