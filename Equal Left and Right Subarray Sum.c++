class Solution {
  public:
    int equalSum(int N, vector<int> &A) {
        // code here
          int sum=0;
        for(int i=0;i<N;i++) sum+=A[i];
        
        int aheadSum=sum,prevSum=0;
        for(int i=0;i<N;i++)
        {
            aheadSum-=A[i];
            if(prevSum==aheadSum) return i+1; // 1based indexing
            prevSum+=A[i];
        }
        return -1;
    }
};