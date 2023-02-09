public class Maximum Bipartite Matching {
    public int maximumMatch(int[][] G)
    {
        // Code here
                int m = G.length;
        int n = G[0].length; //numbers of jobs
        int track[] = new int[n]; // to check jobs are available
        Arrays.fill(track,-1); // filling array with -1
        int result=0;
        for(int i=0;i<m;i++){
          //boolean array reset after every iteration
        boolean visited[] = new boolean[n]; 
            if(matching(i , G , visited , track))result++;
        }
        return result;
    }
    public boolean matching(int curr , int[][] g , boolean[]visited , int[] track){
        for(int i=0;i<g[0].length;i++){
            if(g[curr][i]==1 && !visited[i]){
                visited[i]=true;
                if(track[i]==-1 || matching(track[i] , g , visited ,track)){
                    track[i] = curr; //replacing -1 with curr index
                    return true;
                }
            }
        }
        return false;
    }
}
