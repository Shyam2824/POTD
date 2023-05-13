class Solution {
    public static int bitMagic(int n, int[] arr) {
        // code here
        int left = 0;
        int right = n-1;
        int count = 0;
        while(left < right){
            
            count += arr[left] == arr[right] ? 0 : 1;
            left++;
            right--;
        }
        return (count+1)/2; // or return (int)Math.ceil((double)count/2);
    }
}
   