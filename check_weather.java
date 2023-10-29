public class check_weather {
    static boolean checkKthBit(int n, int k)
    {
        return (n & 1<<k) != 0;
    }
}
