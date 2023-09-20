import java.util.ArrayList;

public class rotate {
    class Solution{
    ArrayList<Integer> rotate(int N, int D){
        ArrayList<Integer> list = new ArrayList<>();
        D=D%16;
        
        int rotate=D;
        int leftRotate=N;
        
        while(rotate-->0){
            int leftMostBit=((leftRotate & (1<<15))!=0)?1:0;
            //System.out.println(leftMostBit);
            leftRotate=leftRotate<<1;
            leftRotate=leftRotate|leftMostBit;
            
            if((leftRotate&(1<<16))!=0)leftRotate=leftRotate^((1<<16));
        }
        
        list.add(leftRotate);
        
        rotate=D;
        int rightRotate=N;
        
        while(rotate-->0){
            int rightMostBit=((rightRotate & 1)!=0)?1:0;
            rightRotate=rightRotate>>1;
            if(rightMostBit==1)rightRotate=rightRotate|(1<<15);
        }
        
        list.add(rightRotate);
        
        return list;
    }
}
}
