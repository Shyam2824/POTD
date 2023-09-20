public class stickler {
    class Solution
{
    // Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        if (n == 0) {
            return 0;
        }
        
        if (n == 1) {
            return arr[0];
        }
        
        int[] dp = new int[n];
        
        // Initialize the first two elements of the dp array.
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        
        // Calculate the maximum money that can be obtained for each house.
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        }
        
        // The maximum money that can be obtained is stored in dp[n-1].
        return dp[n - 1];
    }
}
}
