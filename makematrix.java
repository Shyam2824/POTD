class Solution {
    public static int findMinOperation(int N, int[][] matrix) {
        
        int cnt=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            int sum=0;
            for(int j=0;j<N;j++)
            {
                sum+=matrix[i][j];
            }
            max=Math.max(max,sum);
           
        }
        for(int j=0;j<N;j++)
        {
            int sum=0;
            for(int i=0;i<N;i++)
            {
                sum+=matrix[i][j];
            }
            max=Math.max(max,sum);
        }
        
         for(int i=0;i<N;i++)
        {
            int sum=0;
            for(int j=0;j<N;j++)
            {
                sum+=matrix[i][j];
            }
          cnt=cnt+ max-sum;
        }
        if(cnt>0)
        {
            return cnt;
        }
         for(int j=0;j<N;j++)
        {
            int sum=0;
            for(int i=0;i<N;i++)
            {
                sum+=matrix[i][j];
            }
          cnt=cnt+max-sum;
        }
        return cnt;
    }
}