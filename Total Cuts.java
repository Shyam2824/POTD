public class Total Cuts {
    public static int totalCuts(int N, int K, int[] A) {
        // code here
         int [] max =new int[N];
        int [] min = new int[N];
        int count=0;
        int maxvalue = A[0];
        int minvalue = A[N-1];
        for(int i=0; i<N; i++){
            maxvalue = Math.max(maxvalue, A[i]);
            max[i] = maxvalue;
        }
        for(int i=N-1; i>=0; i--){
            minvalue = Math.min(minvalue, A[i]);
            min[i] = minvalue;
        }
        
        for(int i=0; i<N-1; i++){
            if(max[i]+min[i+1] >= K) count++;
        }
        return count;
    }
}
