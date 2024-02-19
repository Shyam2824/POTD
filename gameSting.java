import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class gameSting {
    class Solution{

    static int minValue(String s, int k){

        // code here

        Map<Character,Integer> hm=new HashMap<>();

        for(char c:s.toCharArray()) hm.put(c,hm.getOrDefault(c,0)+1);

        Queue<Pair> pq=new PriorityQueue<>((x,y)->y.value-x.value);

        for(Map.Entry<Character,Integer> m:hm.entrySet()) pq.add(new Pair(m.getKey(),m.getValue()));

        while(!pq.isEmpty()){

            if(k==0) break;

            Pair p=pq.poll();

            p.value-=1;

            if(p.value!=0) pq.add(new Pair(p.ch,p.value));

            k--;

        }

        int ans=0;

        while(!pq.isEmpty()){

            Pair p=pq.poll();

            ans+=(p.value*p.value);

        }

        return ans;

    }

}

class Pair{

    char ch;

    int value;

    Pair(char ch,int value){

        this.ch=ch;

        this.value=value;

    }

}


}
