class Solution
{
    public int  Count(int[][] matrix)
    {
        // code here
        int n=matrix.length;
        int m = matrix[0].length;
        int count=0,count1=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 1){
                    count1 = 0;
                    for(int x=i-1;x<i+2;x++){
                        for(int y=j-1;y<j+2;y++){
                            if((x >=0) &&(x < n)&&(y<m)&& (y >= 0) && (matrix[x][y] == 0)){
                                count1++;
                            }
                        }
                    }
                    if((count1>0) && (count1%2==0)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}