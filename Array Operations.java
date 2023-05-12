class Solution {
    public static int arrayOperations(int n, int[] arr) {
          boolean isZero = false;
        for(int i=0;i<n;i++){
            if(arr[i]==0)   {
                isZero =true;
                break;
            }
        }
        if(isZero==false)   return -1;
        
        int arrayOps = 0;
       int low = 0,high = 0;
       while(high<n){
           if(arr[high]==0){
               if(high-low>0){
                   arrayOps++;
               }
               low = high+1;
           }
           high++;
       }
       if(high-low>0)   arrayOps++;
       
       return arrayOps;
    }
}