public class BFS of graph {
     ArrayList<Integer> bfs = new ArrayList<>();
        
        boolean[] visit = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        visit[0] = true;
        
        while(!q.isEmpty()){
            int curr = q.poll();
            bfs.add(curr);
            
            for(int n: adj.get(curr)){
                if(!visit[n]){
                    q.add(n);
                    visit[n] = true;
                }
            }
        }
        return bfs;
}
