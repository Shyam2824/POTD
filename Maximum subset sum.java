
class Solution {

    public static long findMaxSubsetSum(int n, int[] arr) {
        return maxSum(arr,0);
    }
    public static long maxSum(int[] arr,int index){
        if(index>=arr.length){
            return 0;
        }
        
        long notTake=arr[index]+maxSum(arr,index+1);
        long take=0;
        if((index+1)<arr.length){
            take=arr[index+1]+maxSum(arr,index+2);
        }
        return Math.max(notTake,take);
    }
}