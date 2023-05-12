class Solution {
  public:
    int arrayOperations(int n, vector<int> &arr) {
        // code here
        int cnt=0;
    for(int i=1;i<n;i++)if(arr[i] != arr[i-1] && arr[i] == 0)cnt++;
    
    if(cnt == 0 && arr[n-1] != 0)return -1;

    return arr[n-1] == 0 ? cnt : cnt + 1;
    }
};