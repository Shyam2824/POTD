import java.util.ArrayList;

public class DFS of Graph {
    class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> dfsTraversal = new ArrayList<>();
        dfsUtil(0, adj, visited, dfsTraversal);
        return dfsTraversal;
    }

    private void dfsUtil(int vertex, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> dfsTraversal) {
        visited[vertex] = true;
        dfsTraversal.add(vertex);

        for (int neighbor : adj.get(vertex)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, adj, visited, dfsTraversal);
            }
        }
    }
}
    
}
