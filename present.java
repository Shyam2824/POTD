public class present {
    Arrays.sort(arr);
    if(N<3) return arr[0];
    if(arr[0]!=arr[1]) return arr[0];
    for(int i=1;i<N;i+=3){
        if(arr[i]!=arr[i-1]){
            return arr[i-1];
        }
    }
    return arr[N-1];
}
