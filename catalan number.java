class Solution {
    public static int findCatalan(int n) {
        long ans=1l;
        long mod=(long)1e9+7;
        for(int i=n+1;i<=2*n;i++){
            ans*=i;
            ans%=mod;
        }
        for(int i=1;i<=n+1;i++){
            ans = (ans*modInverse(i))%mod;
        }
        return (int)ans;
    }
    
    
    // Extended Euclidean Algorithm
    static int modInverse(int num2){
        int num1=(int)1e9+7;
        
        int a=num1,b=num2; 
        int t1=0,t2=1;
        while(b!=0){
            int q=a/b;
            int r=a%b;
            
            int t=t1-t2*q;
            
            a=b;
            b=r;
            t1=t2;
            t2=t;
        }
        
        return (t1+num1)%num1;
    }
}