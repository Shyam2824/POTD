class Solution{
    public:
   bool check(long long int mid, vector<int>& sweetness, int N, int k) {
        long long int sum=0,mn=1e18;
        for(int i=0; i<N; ++i) {
            sum+=sweetness[i];
            if(sum>=mid and k>0) {
                k--;
                mn=min(mn,sum);
                sum=0;
            }
        }
        mn=min(mn,sum);
        if(k>0) return false;
        if(mn>=mid) return true;
        if(sum<mid) return false;
    }
    int maxSweetness(vector<int>& sweetness, int N, int K) {
     // Write your code here.
     long long int h=0; 
     for(int i=0; i<N; ++i) {
         h+=sweetness[i];
     }
     long long l=0;
     while(l<=h) {
         long long int mid=l+(h-l)/2;
         if(check(mid,sweetness,N,K)) l=mid+1;
         else h=mid-1;
     }
     return h;
    }
};