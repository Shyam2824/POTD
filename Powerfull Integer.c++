class Solution{
public:
    int powerfullInteger(int n,vector<vector<int>> &intervals,int k){
        // Code here
         map<int, int> mp;
        for(auto i : intervals)
            mp[i[0]]++, mp[i[1]+1]--;
        
        int ans = -1, sum = 0;
        for(auto i : mp)
        {
            sum += i.second;
            if(sum >= k)
                ans = max(ans, i.first);
        }
        
        if(ans != -1)
        {
            auto itr = mp.find(ans);
            if(itr != mp.end())
                itr++;
            
            ans = itr->first - 1;
        }
        return ans;
    }
};