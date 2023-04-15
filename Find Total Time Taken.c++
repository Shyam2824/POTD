class Solution {
  public:
    int totalTime(int n, vector<int> &arr, vector<int> &time) {
        // code here
         sort(arr.begin(),arr.end());
        int sum=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]!=arr[i])
                sum++;
            else if(arr[i-1]==arr[i]){
                sum+=time[arr[i]-1];
            }    
        }
        return sum;
    }
};