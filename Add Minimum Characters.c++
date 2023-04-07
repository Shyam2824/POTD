class Solution{   
public:
    bool matchstr(string &s1){
        int n = s1.length();
        for (int i = 0; i < n / 2; i++)
        {
            if(s1[i]!=s1[n-i-1]) return 0;
        }
        return 1;
    }
    int addMinChar(string str){ 
        int n=str.size();
        if(matchstr(str)) return 0;
        int i=0,j=n-1;
        string s1;
        while(1){
            s1=str.substr(i,j);
            if(matchstr(s1)) break;
            j--;
        }
        return n-s1.length();
        
    }
};