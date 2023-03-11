class Solution {
    public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int suff[] = new int[N];
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        //Computing a suffix array of frequencies
        //suff[] = [2, 1, 2, 1, 1] 
        for(int i=N-1;i>=0;i--){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i])+1);
            }
            else {
                map.put(A[i],1);
            }
            suff[i] = map.get(A[i]);
        }
        
        int countKs = 0;
        
        //Always the no. of columns is going to stay same i.e 3
        for(int i=0;i<Q.length;i++){
            for(int j=Q[i][0];j<=Q[i][1];j++){
                if(suff[j]==Q[i][2]){
                    countKs++;
                }
            }
            ans.add(countKs);
            countKs = 0;
        }
        return ans;
    }
}
