class Solution {
  public:
    int getMaximum(int N, vector<int> &arr) {
        // code here
         long long sum = accumulate(arr.begin(),arr.end(),0LL);
    
    for(int i=N;i>=1;i--)if(sum % i == 0)return i;
    
    return 1;
    }
};