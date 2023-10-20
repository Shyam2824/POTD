class Solution {
    static int isPossible(int n, int arr[]) {
        
        long sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        if(sum%3l==0){
            return 1;
        }else{
            return 0;
        }
    }
}