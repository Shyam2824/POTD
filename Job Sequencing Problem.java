class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
           PriorityQueue<Job> pq = new PriorityQueue<>(new Comparator<Job>() {
        public int compare(Job n1, Job n2) {
           if(n1.profit != n2.profit){
               return n2.profit-n1.profit; 
           }else if(n1.deadline != n2.deadline){
                return n2.deadline-n1.deadline;    
           }
           return n2.id-n1.id;
        }
    });
        int dlu = 0; 
        Set<Integer> set = new HashSet<>(); 
        int cnt=0, ans=0; 
        for(Job x : arr){
            pq.offer(x); 
        }
        while(!pq.isEmpty()){
            Job cur = pq.poll();
            while(set.contains(cur.deadline)){
                cur.deadline--; 
            }
            if(set.contains(cnt+1)){
                cnt++; 
                set.remove(cnt); 
            } 
            if(cur.deadline > cnt){
                if(cur.deadline == 1+cnt){
                    cnt++; 
                    ans+=cur.profit; 
                    dlu++;
                }else{
                    set.add(cur.deadline);
                    ans+=cur.profit; 
                    dlu++;
                } 
            }
           
        }
        return new int[]{dlu, ans}; 
    }
}