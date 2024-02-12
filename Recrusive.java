public class Recrusive {
    class Solution {
        static long sequence(int n) {
            // Constants
            long mod = 1000000007;
            long sum = 0;
            long count = 1;
    
            // Har ek term ke liye sequence mein ghoomo
            for (int i = 1; i <= n; i++) {
                // Lagao consecutive numbers ka product
                long mul = 1;
                for (int j = 1; j <= i; j++) {
                    mul = (mul * count) % mod;
                    count++;
                }
    
                // Update karo cumulative sum
                sum = (sum + mul) % mod;
            }
    
            // Aakhir mein result do, modulo mod lekar
            return sum;
        }
    }
}
