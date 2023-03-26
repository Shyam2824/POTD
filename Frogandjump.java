public class Frogandjump {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
                int size  = leaves+1;
        Boolean[] visited  = new Boolean[size];
        Arrays.fill(visited,false);
        Arrays.sort(frogs);
        for(int i=0;i < N ; i++){
            if(frogs[i] == 1){
                return 0;
            }
            if(frogs[i]> leaves ||frogs[i]== 0|| visited[frogs[i]] == true){
                continue;
            }
            
            if(frogs[i] <= leaves&& visited[frogs[i]] ==false){
            int j =frogs[i];
            while(j <= leaves){
                if(visited[j] != true){
                visited[j] = true;
                size--;
                }
                j=j+frogs[i];
            }
            }
            if(size == 1){
                break;
            }
        }
       
        return --size;
    }
    
}
