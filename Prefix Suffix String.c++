class Solution{
public:
    int prefixSuffixString(vector<string> &s1,vector<string> s2){
        // Code here
          int ans = 0;
         for(auto c : s2){
                int size = c.size();
                for(auto child : s1){
                    int n = child.size();
                    if(n<size) continue;
                    if(c[0]==child[0]){
                        string left = child.substr(0,size);
                        if(left==c){
                            ans++;
                            break;
                        }
                    }
                    if(c[size-1]==child[n-1]){
                        string right = child.substr(n-size,size);
                        if(right == c){
                            ans++;
                            break;
                        }
                    }
                }
         }
        return ans;

    }
};