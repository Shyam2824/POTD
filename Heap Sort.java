public class Heap Sort {

        void buildHeap(int arr[], int n)
    {

       for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        
        //swap the element and heapify again
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        // Your code here
        int largest=i;
        int li=2*i+1;
        int ri=2*i+2;
        
        if(li<n && arr[li]>arr[largest]){
            largest=li;
        }
        if(ri<n && arr[ri]>arr[largest]){
            largest=ri;
        }
        
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,n,largest);
        }
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        //code here
        Solution s=new Solution();
        s.buildHeap(arr,n);
    }
    
}
