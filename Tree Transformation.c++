class Solution {
    public:
    int solve(int N, vector<int> p){
        // code here
               set<int> st;
        
        for(int i = 0; i < N ; i++ )
            if( p[i] != -1 && p[i] != 0 ) st.insert(p[i]);
       
       return st.size();
    }
};