long long int no_of_subarrays(int n, vector<int> &arr) {
    // Write your code here.
     int zeros=0;
    long long int ans=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==0)
        {
            zeros++;
            ans+=zeros;
        }
        else if(arr[i]==1)
        {
            zeros=0;
        }
    }
    return ans;
}