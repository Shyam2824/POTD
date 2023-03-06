class Solution {
    public static int noConseBits(int n) {
        // code here
   
      return

Integer.parseInt(Integer.toBinaryString(n).replaceAll("111", "110"),2);

    }
}
        
