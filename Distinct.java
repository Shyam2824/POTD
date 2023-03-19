public class Distinct {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        // code here
          HashSet<Integer> left=new HashSet<Integer>();
        HashMap<Integer,Integer> right=new HashMap<Integer,Integer>();
        for(int i=0;i<N;i++){
            right.put(A[i],right.getOrDefault(A[i],0)+1);
        }
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            if(right.get(A[i])==1){
                right.remove(A[i]);
            }
            else {
                right.put(A[i],right.get(A[i])-1);
            }
            res.add(left.size()-right.size());
            left.add(A[i]);
        }
        return res;
    }
}
}
