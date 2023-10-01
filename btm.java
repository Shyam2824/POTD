import java.util.ArrayList;

public class btm {
    class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
        //for row 0
        ArrayList<Integer> res =new ArrayList<>();
        
        int size= 0 ;
        if(m==1){
            
            for(int i = 0 ; i < n ; i++){
                res.add(matrix[i][0]);
            }
        }
        else if(n==1){
            for(int i = 0 ; i < m ; i++){
                res.add(matrix[0][i]);
            } 
            
        }
        else{
            for(int i =0 ; i < matrix[0].length ;i++){
             res.add(matrix[0][i]);
         }
         //now for row 1 to n-2 one side
            for(int i =1 ; i < n-1 ; i++){
             res.add(matrix[i][m-1]);
         }
        // now the last row in reverese order
            for(int i = m-1  ;i >=0 ; i--){
              res.add(matrix[n-1][i]);
         }
        //now the other side
           for(int i =n-2 ; i>=1 ; i--){
             res.add(matrix[i][0]);
         } 
        }
        return res;
    }
}
}
