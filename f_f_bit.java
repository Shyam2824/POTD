public class f_f_bit {
    public static int getFirstSetBit(int n){
            
        boolean flag=true;
        int count=0;
        if(n==0){
            return 0;
        }
        while(flag){
            if((n&1)==1){
                flag=false;
                count++;
                break;
            }
            count++;
            n=n>>1;
        }
        return count;
            
    }
}
