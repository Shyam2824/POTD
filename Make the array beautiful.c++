class Solution {
  public:
    vector<int> makeBeautiful(vector<int> arr) {
        // code here
        vector<int>s;
        for(auto num:arr){
            if(s.size()>0 && ((num>=0 && s.back()<0) || (num<0 && s.back()>=0)))
                s.pop_back();
            else
                s.push_back(num);
        }
        return s;
    }
};