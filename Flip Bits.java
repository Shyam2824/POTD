public class Flip Bits {
    class Solution {

    public static int maxOnes(int a[], int n) {
        // Your code goes here
        int zero_count=0;
        int one_count=0;
        int max=Integer.MIN_VALUE;
        
        for(int val:a){
            if(zero_count<0) zero_count=0;
            if(val==1){
                one_count+=1;
                zero_count-=1;
            }
            if(val==0)zero_count+=1;
            
            max=Math.max(zero_count,max);
        }
        if(max<0) return one_count;
        return max+one_count;
    }
} 
}
