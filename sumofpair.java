public class sumofpair {
    class Solution{
   
        public long sumXOR (int arr[], int n) {
            long val=1,ans=0;
            
            for(int i=0;i<31;i++){
                int cnt=0;
                for(int j=0;j<n;j++){
                    cnt+= (arr[j]&val)>0?1:0;
                }   
                ans+= val*(n-cnt)*cnt;
                val<<=1;
            }
            return ans;
        }
    }
}
