public class Minimum Steps Required {
    int minSteps(String str) {
		//Write your code here
		int n=str.length();
        int count=1,ans=0;
        
        for(int i=1;i<n;i++){
            if(str.charAt(i-1)!=str.charAt(i)){
                ans++;
                count=0;
            }
            count++;
        }
        if(n>0) ans++;
        return (ans==0?ans:(ans>>1)+1);
	}
    
}
