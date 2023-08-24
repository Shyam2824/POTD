class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        int [] arr=new int[s1.length()+s2.length()];
        
       
        int flag=0; 
        if(s1.charAt(0)=='-'){//managing the signs
             flag=1;
             s1=s1.substring(1,s1.length());
        }
        if(s2.charAt(0)=='-')
        {
            flag^=1;
            s2=s2.substring(1,s2.length());
        }
   
          int i=0,j=s2.length()-1,k=0,pf=0,carry=0,val=0,prod=0;
        while(j>=0){
            
            k=arr.length-1-pf;
            i=s1.length()-1;
            while(i>=0 || carry!=0){
                val=(i>=0)?s1.charAt(i)-'0':0;
                prod=val*(s2.charAt(j)-'0')+carry+arr[k];
                arr[k]=prod%10;
                carry=prod/10;
                k--;
                i--;
            }
            pf++;
            j--;
        }
//   for( i=0;i<arr.length;i++)
//                     System.out.println(arr[i]);
      i=0;
      StringBuilder s=new StringBuilder();
      if(flag==1)
         s.append('-');
             flag=0;
      while(i<arr.length && flag==0){
          if(arr[i]!=0)
             flag=1;
        else
          i++;
      }
      for( k=i;k<arr.length;k++)
         s.append(arr[k]);
         
         return s.toString();
    }
}