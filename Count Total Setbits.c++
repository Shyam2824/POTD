class Solution {
  public:
    long long countBits(long long N) {
        // code here
          long long cnt=0;
        for(int i=1;i<=N;i++)
        {
            cnt += __builtin_popcount(i);
        }
        return cnt;
    }
};