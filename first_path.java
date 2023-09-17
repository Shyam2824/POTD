public class first_path {
    class Solution

{

public static long[] printFibb(int n) 

    {

        //Your code here

        long a[]=new long[n];

        for(int i=0;i<n;i++)

        {

            if(i<2)

              a[i]=1;

            else 

              a[i]=a[i-1]+a[i-2];

        }

        return a;

    }

}
}
