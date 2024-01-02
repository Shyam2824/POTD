public class largestSumSubarray {
    class Solution {

        public long maxSumWithK(long a[], long n, long k)
        {
            long sum = 0;
            for(int i = 0; i < k; i++){
                sum += a[i];
            }
            long maxsum = sum;
            long p = maxsum; 
            for(int i = (int)k; i < n; i++){
                sum = sum + a[i] - a[i - (int)k];
                p = Math.max(p + a[i], sum);
                maxsum = Math.max(maxsum, p);
            }
            return maxsum;
        }
    }
}
