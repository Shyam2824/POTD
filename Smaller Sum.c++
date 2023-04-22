class Solution{
public:
    vector<long long> smallerSum(int n,vector<int> &arr){
        // Code here
        vector<int>temp;
        temp=arr;
        sort(temp.begin(),temp.end());
        unordered_map<long long int,long long int>m;
        vector<long long int>v;
        long long int s=0;
        for(int i=0;i<n;i++)
        {
            if(!m.count(temp[i])) m[temp[i]]=s;
            s+=temp[i];
        }
        for(int i=0;i<n;i++)
        {
            v.push_back(m[arr[i]]);
        }
        return v;
    }
};