public class wave_A {
    class Solution {
        public static void convertToWave(int n, int[] arr) {
            // code here
            for(int i=1; i<n; i+=2) {
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
        }
    }
}
