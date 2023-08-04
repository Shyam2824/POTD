class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        Queue<Integer> que = new LinkedList<>();
        while(!s.isEmpty()){
            que.add(s.pop());
        }
        while(!que.isEmpty()){
            s.push(que.remove());
        }
    }
}

 


