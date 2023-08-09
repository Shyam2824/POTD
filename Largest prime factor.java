class Solution{
    static long largestPrimeFactor(int N) {
        // code here
        int i=2;
        int res = 2;
        while(N!=1){
            if(N%i==0){
                N/=i;
                res =Math.max(i,res);
                i=2;
                continue;
            }
            i++;
        }
        return res;
    }
}

