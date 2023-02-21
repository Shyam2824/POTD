class Solution{   
public:
    int minIteration(int N, int M, int x, int y){    
        // code here
          int a[4];

        a[0]=(x-1)+(y-1);

        a[1]=(N-x)+(M-y);

        a[2]= (x-1)+(M-y);

        a[3]=(N-x)+(y-1);

        sort(a,a+4);

        return a[3];
    }
};