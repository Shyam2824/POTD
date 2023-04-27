class Solution {
     public static ArrayList<Character> easyTask(int n,String s,int q,query queries[])
    {
        StringBuilder sb = new StringBuilder(s);
        ArrayList<Character> list = new ArrayList<>();
        PriorityQueue<Character> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i< queries.length; i++){
            query Q = queries[i];
            if(Q.type == "1"){
                sb.setCharAt(Integer.valueOf(Q.a), Q.b.charAt(0));
            }else{
                int left = Integer.valueOf(Q.a);
                int right = Integer.valueOf(Q.b);
                int k = Integer.valueOf(Q.c);
                String substr = sb.substring(left, right+1);
                // System.out.println(substr);
                for(int ind=0; ind<substr.length(); ind++) pq.add(substr.charAt(ind));
                char ch = ' ';
                while(k>0){
                    ch  = pq.poll();
                    k--;
                }
                pq.clear();
                if(ch != ' ') list.add(ch);
            }
        }
        return list;
    }
}