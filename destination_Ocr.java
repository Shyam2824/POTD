public class destination_Ocr {
    class Solution
{
    int  subsequenceCount(String s, String t)
    {
// Your code here
   int mod=1000000007;
    int n = s.length(), m = t.length();
     int dp[][] = new int[n + 1][m + 1];
     for (int i = 0; i <= n; i++)dp[i][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1]) % mod;
                } else {
                   
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][m];
    }
}
}
