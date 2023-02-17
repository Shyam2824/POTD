class Solution {
    static long solve(int N, int K, ArrayList<Long>list) {
        //code here
          int i=0,j=0;

        long sum=0;

        while(j<N){

            sum+=list.get(j);

            if(j-i+1<K){

                j++;

                continue;

            }

            list.add(sum);

            sum-=list.get(i);

            i++;

            j++;

        }

        return list.get(N-1);


    }
}