class Solution {
public:
    int solve(int a, int b, int c) {
        // code here
         int sum2=0;
        vector<int>ans;
        ans.push_back(a);
        ans.push_back(b);
        ans.push_back(c);
        sort(ans.begin(),ans.end());
        sum2=ans[0]+ans[1];
        if(ans[2]<(sum2*2)+3)
            return a+b+c;
        else
            return -1;
    }
};