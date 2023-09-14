import java.util.Arrays;

public class p_sum {
    class Solution{
 
public int perfectSum(int arr[],int n, int sum) 
{ 
    // Your code goes here
    int MOD = 1000000007;
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= arr[i]; j--) {
                dp[j] += dp[j - arr[i]];
                dp[j] %= MOD;
            }
        }
        return dp[sum];
    
} 
}
}
