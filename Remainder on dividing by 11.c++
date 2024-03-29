
class Solution
{

public:
    int xmod11(string x)
    {
       // code here
    long long odd = 0, even = 0;
       for(int i = 0; i < x.length(); ++i) {
           if(i % 2 == 0)
              odd += (x[i] - '0');
           else
              even += (x[i] - '0');
       }
       
      
       long long diff = (odd - even) % 11;
       if(x.length() % 2 == 0)
          return abs(diff - 11) % 11;
   
       return diff;
    }
};