public class Update Queries {
    int [] updateQuery(int N, int Q, int [][]U){
        //Write your code here
           int result[] = new int[N];

        for(int k=0;k<Q;k++){

            int l = U[k][0];

            int r = U[k][1];

            int x = U[k][2];

            

            for(int i=l-1;i<r;i++){

                result[i] = result[i] | x ;

            }

        }

        return result;
    }
}
