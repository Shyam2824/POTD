class Solution {
  public:
    bool isStraightHand(int N, int groupSize, vector<int> &hand) {
        // code here
          if(N % groupSize) return false;
        
        map<int, int> m;
        for(int i : hand) m[i]++;
        
        int k = N / groupSize;
        while(k--) {
            int pre = m.begin() -> first;
            m[pre]--;
            if(!m[pre]) m.erase(pre);
            
            for(int i=1; i<groupSize; i++) {
                if(m.find(pre + 1) == m.end()) return false;
                pre += 1;
                m[pre]--;
                if(!m[pre]) m.erase(pre);
            }
        }
        return true;
    }
};