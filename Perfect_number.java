public class Perfect_number {
    class Solution {
        static int isPerfectNumber(long N) {
            // code here
            long sum=0;
            
            
            for(long i=1;i<= Math.sqrt(N);i++){
                if(N%i==0){
                    
                    if(N/i==N){
                        sum=sum+i;
                    }
                    else{
                         sum=sum+i+(N/i);
                    }
                   
                    
                   
                }
            }
            
            if(sum==N && N>1){
                return 1;
            }
            else{
                return 0;
            }
        }
    };  
}
