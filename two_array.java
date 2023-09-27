import java.util.ArrayList;

public class two_array {
    class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        
        //Initialze the diff which stores the diffrence
        ArrayList<Integer> list = new ArrayList<>();
        int diff=Integer.MAX_VALUE;
        int left=0;
        int right=m-1;
        
        while(left<n && right>=0){
            
            //update the diff when sum of val at (left ptr + right ptr - x )is minimum
            if( Math.abs(arr[left]+brr[right]-x) < diff){
                
                diff=Math.abs(arr[left]+brr[right]-x);
                list.clear();
                list.add(arr[left]);
                list.add(brr[right]);
                
            }
            if(arr[left] + brr[right] < x)
            {
                left++;
            }
            else{
                right--;
            }
        }
        
        return list;
    }
}
}
