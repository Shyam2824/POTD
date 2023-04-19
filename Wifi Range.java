public class Wifi Range {
    boolean wifiRange(int N, String S, int X) 
    { 
        // code here
          int [] wifi = new int[N+1];
        for(int i=0; i< N; i++){
            if(S.charAt(i) == '1'){
                int left = Math.max(0, i-X);
                int right = Math.min(N-1, i+X);
                wifi[left]++;
                wifi[right+1]--;
            }
            
        }
        for(int i=0; i<N; i++){
            if(i > 0) wifi[i] += wifi[i-1];
            if(wifi[i] == 0) return false;
        }
        return true;
    }
}
