public class Sequence {
    static int numberSequence(int m, int n)
    {
        int[][] dp = new int[m + 1][n + 1];

        // Initialize base cases
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        // Fill the DP table using bottom-up approach
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i / 2][j - 1] + dp[i - 1][j];
            }
        }

        return dp[m][n];
    }
}
