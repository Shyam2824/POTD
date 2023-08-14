public class non_repeted{
    public int[] singleNumber(int[] nums)
    {
        //TreeSet<Integer> items = new TreeSet<>();
        int xor = 0;
        for(int num: nums){
            xor ^= num;
        }
        if(xor == 0) return new int[]{};
        
        int temp = xor;
        int bitmask = 1;    


        //finding first non zero bit 

        while(temp > 0 && (temp & 1) != 1){
            temp  = temp >> 1;
            bitmask = bitmask << 1;
        }


        //taking xor of elements matching bitmask only.
        int first = 0;
        for(int n: nums){
            if((n & bitmask) != 0){
                first ^= n;
            }
        }
        
        int sec = xor ^ first;
        
        return new int[]{Math.min(first, sec), Math.max(first, sec)};
    }
}