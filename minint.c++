class Solution {
  public:
    int minimumInteger(int n, vector<int> &a) {
        // code here
         long long int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        int x, ans = 9999999999;
        if(sum%n == 0)
            x = sum/n;
        else
            x = (sum/n)+1;
        for(int i=0;i<n;i++){
            if(a[i]>=x)
                ans=min(ans, a[i]);
        }
        return ans;
    }
};