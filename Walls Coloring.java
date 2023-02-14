class Solution{
	int minCost(int [][] colors, int N){
        //Write your code here
          int min=Integer.MAX_VALUE;

        for(int i=1;i<N;i++){

                colors[i][0]+=Math.min(colors[i-1][1],colors[i-1][2]);

                colors[i][1]+=Math.min(colors[i-1][0],colors[i-1][2]);

                colors[i][2]+=Math.min(colors[i-1][0],colors[i-1][1]);

                min=Math.min(colors[i][0],Math.min(colors[i][1],colors[i][2]));

        }

        return min;


    }
}