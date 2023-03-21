class Solution{
public:
    int minimumTime(int N,int cur,vector<int> &pos,vector<int> &time){
         int ans=10e9;
        for(int i=0;i<pos.size();i++){
            int temp=(abs(pos[i]-cur))*time[i];
            ans=min(ans,temp);
        }
        return ans;
    }
};