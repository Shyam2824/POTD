import java.util.ArrayList;

public class Mother_Vertex {
    class Solution {
    
    private void DFSUtil(ArrayList<ArrayList<Integer>> adj, int v, boolean[] visited) {
        visited[v] = true;

        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                DFSUtil(adj, neighbor, visited);
            }
        }
    }    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        int motherVertex = -1;

        for (int v = 0; v < V; v++) {
            if (!visited[v]) {
                DFSUtil(adj, v, visited);
                motherVertex = v; 
            }
        }

       
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }

       
        DFSUtil(adj, motherVertex, visited);

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                return -1;
            }
        }

        return motherVertex;
    }
}
}
