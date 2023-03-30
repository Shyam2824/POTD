public class minInt {
    public static int minimumInteger(int N, int[] A) {
        // code here
           long sum=0;
        long X=0;
        long p = 0;
        long q= 0;
          long min= Integer.MAX_VALUE ;
        int gc=0;
        Arrays.sort(A);
       for(int i=0;i<A.length;i++){
           sum=sum+A[i];
       }
       
       for(int j=1;j<=A.length;j++){
           if(sum==(long)((long)A[j-1]*(long)N)){
               X=(long)A[j-1];
           }
           else
           {
             if(sum>(long)((long)A[j-1]*(long)N) && sum<(long)((long)A[j]*(long)N))
             { 
                 if(j==N){
                break;
                }
                p=sum-(N*A[j]);
                q=sum-(N*A[j-1]);
               min=Math.min(p,q);
                if(min==p){
                    X=(long)A[j];
                }
                else{
                    X=(long)A[j-1];
                }
                
             }
           }
          
       }
       
       if(N==1){
           X=A[0];
       }
    return (int)X;
    }
}
