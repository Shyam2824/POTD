class Solution{
public:
    string stringMirror(string str){
        // Code here
           string s;
       int i=0;
       s=s+str[0];
       while(i<str.length()-1&&((i>0&&str[i]>=str[i+1])||(i==0&&str[i]>str[i+1])))
       {
           s=s+str[i+1];
           i++;
       }
    string ans=s;
    reverse(s.begin(),s.end());
    ans=ans+s;
    return ans;
    }
};