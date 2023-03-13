class Solution {
  public:
    long long maxPossibleValue(int N,vector<int> A, vector<int> B) {
        // code here
        long long pair=0,m=INT_MAX,ans=0;
        for(int i=0;i<N;i++){
                int d=B[i]/2;
                if(d>=1){
                        ans=ans+ d*2*A[i];
                        pair+=d;
                        m=min(int(m),A[i]);
                }
        }
        if(pair%2 ==1){
                ans-=2*m;
        }
        return ans;

    }
};