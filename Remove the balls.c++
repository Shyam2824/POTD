class Solution {
  public:
    int finLength(int N, vector<int> color, vector<int> radius) {
        stack<int>col,rad;
        col.push(color[0]); rad.push(radius[0]);
        for(int i=1;i<N;i++){
            if(col.size()==0 || rad.size()==0){
                col.push(color[i]); rad.push(radius[i]);
            }else if(col.top()==color[i] && rad.top()==radius[i]){
                col.pop(); rad.pop();
            }else{
                col.push(color[i]); rad.push(radius[i]);
            }
        }
        return col.size();
    }
};