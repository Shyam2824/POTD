public class move_all_zero {
    class Solution {
        void swap(int n1,int n2,int arr[]){  //Swap Function
               int temp=arr[n1];
               arr[n1]=arr[n2];
               arr[n2]=temp;
           }
       void pushZerosToEnd(int[] arr, int n) { 
           // code here
           int nonZero=0;
           int Zero=0;
           if(arr.length==0||arr.length==1){ //Base Case
               return;
           }
           while(nonZero<arr.length){
               if(arr[nonZero]!=0){
                   swap(nonZero,Zero,arr);
                   nonZero++;
                   Zero++;
               }
               else{
                   nonZero++;
               }
           }
          
           
       }
   }
}
