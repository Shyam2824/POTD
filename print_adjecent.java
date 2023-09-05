import java.util.ArrayList;
import java.util.List;

public class print_adjecent {
    class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        // make the adjacency matrix
        
        List<List<Integer>>al=new ArrayList<>();
        for(int i=0;i<V;i++){
            al.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            al.get(edges[i][0]).add(edges[i][1]);
            al.get(edges[i][1]).add(edges[i][0]);
        }
        
        return al;
    }
}
}
