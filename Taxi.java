public static int minimumTime(int N, int cur, int[] pos, int[] time) {
    // code here
     int ans=Integer.MAX_VALUE;
    for(int i=0;i<pos.length;i++){
        int min=Math.abs(pos[i]-cur)*time[i];
        ans=Math.min(min,ans);
    }
    return ans;

}