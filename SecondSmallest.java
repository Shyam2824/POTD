public class SecondSmallest {
    static String secondSmallest(int S, int D){
        // code here
                if(S/D>=9){
            return "-1";
        }
        int[] arr=new int[D];
        Arrays.fill(arr,0);
        int in=0;
        while(S!=0){
            in++;
            if(S>=9){
                arr[D-in]=9;
                S-=9;
            }else{
                arr[D-in]=S;
                S=0;
            }
            
        }
        if(arr[0]==0){
            arr[D-in]--;
            arr[0]++;
        }
        in=D-2;
        while(arr[in]==9){
            in--;
        }
        arr[in]++;
        arr[in+1]--;
        String ans="";
        for(int i:arr){
            ans+=i;
        }
        return ans;

    }
    
}
