public class Maximum Triplet product {
    Long maxTripletProduct(Long arr[], int n)
    {
        // Complete the function
                Arrays.sort(arr);

        long a=arr[0]*arr[1]*arr[n-1];

         long b=arr[n-1]*arr[n-2]*arr[n-3];

         return Math.max(a,b);


    }
}
