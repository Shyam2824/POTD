public class Anti_Dignol {
    class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        int n=matrix.length;
        int ans[]=new int[n*n];
        int r=0,c=0,x=0,z=0;
        for(int k=0;k<(2*n)-1;k++){
            if(k<n){
                r=0;c=k;
            }
            else{
                z++;
                c=n-1;r=z;
            }
            while(r<n && c>=0){
                ans[x++]=matrix[r][c];
                r++;c--;
            }
        }
        return ans;
    }
}
}
