class Solution {
public:
    vector<int> findMaxRow(vector<vector<int>> mat, int n) {
        //code here
           int j=n-1;
        int max_ones=-1e9;
        int row;
        for(int i=0;i<n;i++)
        {
            for( ;j>=0;j--)
            {
                if(mat[i][j]==0) break;
                
            }
            if(n-j-1>max_ones)
            {
                max_ones=n-j-1;
                row=i;
            }
        }
        return {row,max_ones};
    }
};