//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
void sort012(int a[], int n)
{
 int one = 0, two = 0,zero = 0;
        for(int i=0;i<n;i++){
            if(a[i] == 1){
                one++;
            }
            else if(a[i] == 2){
                two++;
            }
            else{
                zero++;
            }
        }
        for(int i=0;i<zero;i++) a[i] = 0;
        for(int i=zero;i<zero+one;i++) a[i] = 1;
        for(int i=zero+one;i<one+zero+two;i++) a[i] = 2;       
}