public class Number of Good Components {
    class Solution {
        static int total_nodes = 0;
          static boolean isFullyConnected = true;
          
          private void dfs(int node, int size, boolean visited[], ArrayList<ArrayList<Integer>> adj)
          {
              visited[node] = true;
              total_nodes++;
              
              if(size!=adj.get(node).size())
              {
                  isFullyConnected = false;
              }
              
              for(int nei : adj.get(node))
              {
                  if(visited[nei]==false)
                  {
                      dfs(nei, size, visited, adj);
                  }
              }
              
          }
          
          public int findNumberOfGoodComponent(int V, ArrayList<ArrayList<Integer>> adj) {
              
              int ans = 0;
              boolean visited[] = new boolean[V+1];
              
              for(int i=1; i<=V; i++)
              {
                  if(visited[i] == false)
                  {
                      total_nodes = 0;
                      isFullyConnected = true;
                      int deg = adj.get(i).size();
                      dfs(i, deg, visited, adj);
                      
                      if(isFullyConnected && total_nodes-1==deg)
                      {
                          ans++;
                      }
                      
                  }
              }
              
              
              return ans;
          }
      }
}
