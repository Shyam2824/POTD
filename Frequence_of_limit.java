import java.util.HashMap;

public class Frequence_of_limit {
    class Solution{
    public static void frequencyCount(int arr[], int N, int P)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            if(arr[i]>=1 && arr[i]<=P)
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<N;i++){
            arr[i]=map.getOrDefault(i+1,0);
        }
    }
}
}
