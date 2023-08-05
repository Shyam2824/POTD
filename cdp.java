import java.util.ArrayList;
import java.util.Collections;

class Solution{
    public long findMinDiff (ArrayList<Integer> a, int n, int m){
        Collections.sort(a);
        int j = m-1,i = 0,min = Integer.MAX_VALUE;
        while(j<n) min = Math.min(a.get(j++)-a.get(i++),min);
        return min;
    }
}