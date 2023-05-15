class Solution {
    public static long countBits(long N) {
        // code here
          long count=0;
        for(long i=1;i<=N;i++)
        {
            count += Long.bitCount(i);
        }
        return count;
    }
}