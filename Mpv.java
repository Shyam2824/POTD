public class Mpv {
    long maxPossibleValue(int N, int A[] ,int B[]) { 
    long ans=0;

        int mini=Integer.MAX_VALUE;

        int cnt=0;

        for(int i=0;i<A.length;i++){

            int tmp=B[i]/2;

            if(tmp!=0)mini=Math.min(A[i],mini);

            cnt+=tmp;

            ans+=A[i]*tmp*2;

        }

        if(cnt%2==1)ans-=mini*2;

        return ans;
    }    
}
