public class min_distance {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int xIndex = -1;
        int yIndex = -1;
        int minDifference = n + 1;
        
        for(int i = 0; i < n; i++) {
            if(a[i] == x) {
                xIndex = i;
            }
            
            if(a[i] == y) {
                yIndex = i;
            }
            
            if(xIndex != -1 && yIndex != -1) {
                minDifference = Math.min(minDifference, Math.abs(xIndex - yIndex));
            }
        }
        
        if(minDifference == 0 || minDifference == n + 1) {
            return -1;
        }
        
        return minDifference;
    }


}
