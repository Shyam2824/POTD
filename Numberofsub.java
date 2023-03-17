public class Numberofsub {
    long no_of_subarrays(int N, int [] arr) {
		//Write your code here
		long sum = 0;
		long count=0;
		for(int i=0;i<N;i++){
		    if(arr[i]==0){
		        count++;
		    }
		    else if(count>0){
		        sum = sum + (count*(count+1L))/2L;
		        count = 0;
		    }
		}
		sum = sum + (count*(count+1L))/2L;
		return sum;
	}
}
