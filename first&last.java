public class first&last {
    class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList <Integer> al=new ArrayList<>();
        int f=1,a=-1,b=-1;
       for(int i=0;i<n;i++)
       {
           if(arr[i]==x && f==1)
           {    a=i;
               f=0;
           }
           if(arr[i]==x)
           {   b=i;
           }
       }
       al.add(a);
       al.add(b);
       return al;
    }
}
}
