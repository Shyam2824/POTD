
class Solution {
  public:
    vector<vector<int>> dp;
    int mod = (int)1e9+7;
    int sol(int i, int j, vector<vector<int>> &a)
    {
        if(i>=a.size() || j>=a[0].size() || !a[i][j]) return 0;
        if(i==a.size()-1 && j==a[0].size()-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j] = (sol(i+1,j,a) + sol(i,j+1,a))%mod;
    }
    int uniquePaths(int n, int m, vector<vector<int>> &a) {
        if(a[n-1][m-1]==0) return 0;
        dp.resize(n,vector<int> (m,-1));
        return sol(0,0,a);

    }
};