public class Equal Left and Right Subarray Sum {
    int equalSum(int [] A, int N) {
		//Write your code here
		int totalSum = 0 , leftSum = 0;
		for(int num : A)    totalSum += num;
		for(int i=0;i<N;i++){
		    totalSum -= A[i];
		    if(totalSum == leftSum) return i+1;
		    leftSum += A[i];
		}
		return -1;
	}
}
