public class Swapnumber {
    public void swapElements(int[] arr, int n)
    {
        // Code here
    
        for(int i=0;i<n-2;i++){
            
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
    }
}
