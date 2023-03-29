class Solution
{
    public:
    int countSubstring(string S)
    {
        int ans=0;
        for (int i=0;i < S.length(); i++){
            int small =0;
            int capital =0;
            for (int j =i; j< S.length(); j++){
                if (S[j]>= 'a' && S[j]<= 'z'){
                    small++;
                }
                else{
                    capital++;
                }
                if (capital == small){
                    ans++;
                }
            }
        }
        return ans;
    }
};