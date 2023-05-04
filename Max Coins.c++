class Solution{
public:
    int maxCoins(int n,vector<vector<int>> &ranges){
        // Code here
        sort(ranges.begin(), ranges.end());
        vector<int> maxe(n);
        maxe[n-1] = ranges[n-1][2];
        for(int i = n-2; i >= 0; i--) {
            maxe[i] = max(ranges[i][2], maxe[i+1]);
        }
        
        int res = INT_MIN;
        
        // for(auto &v: ranges) {
        //     for(auto i: v) cout << i << " ";
        //     cout << endl;
        // } cout << endl;
        
        for(int i = 0; i < n; i++) {
            vector<int> curr = ranges[i];
            vector<int> next = {curr[1], curr[1], -1};
            int j = lower_bound(ranges.begin(), ranges.end(), next) - ranges.begin();
            if(j <= i) j = i+1;
            int val = curr[2];
            if(j < n && j > i) val += maxe[j];
            res = max(res, val);
            // cout << i << " " << j << endl;
            // cout << val << " " << curr[2] << " " << val - curr[2] << endl;
        }
        
        return res;
    }
};