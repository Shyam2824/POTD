class Solution{
    public:
        const int mod = 1e9 + 7;
    int dp[1005][1005];
    int numOfWays(int n, int x)
    {
        memset(dp, 0, sizeof(dp));
        for(int i=1;i<=n+1;i++) dp[i][0]=1;
        
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                int t=0,nt=0;
                nt=dp[i+1][j];
                int nj=j-pow(i,x);
                if(nj>=0)
                {
                    t=dp[i+1][nj];
                }
                dp[i][j]=(t+nt)%mod;
            }
        }
        return dp[1][n];    // code here
        
    }
};