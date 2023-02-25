
class Solution {
  public:
    bool isDigit(char c){
     return (c>='0' && c<='9');
  }
    int checkCompressed(string S, string T) {
        // code here
        int n = S.length();
        int m = T.length();
        int i=0,j=0;
        while(i<n && j<m){
            if(isDigit(T[j])){
                int cnt=0;
                while(j<m && isDigit(T[j])){
                    cnt = cnt*10 + (T[j]-'0');
                    j++;
                }
                i+=cnt;
            }
            else if(S[i]==T[j]) i++,j++;
            else if(S[i]!=T[j]) return 0;
        }
        return i==n && j==m;

    }
};