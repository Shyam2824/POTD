class Solution{
    public:
    bool wifiRange(int N, string S, int X){
        // code here
        vector<pair<int,int>> v;
        for(int i=0;i<N;i++){
            if(S[i]=='1') v.push_back({i-X,i+X});
        }
        for(auto i:v){
            int k=i.first;
            if(k<0) k=0;
            while(k<=i.second and k<N){
              S[k]='1';
              k++;
            }
        }
        for(int i=0;i<N;i++){
            if(S[i]=='0') return false;
        }
        return true;
    }
};