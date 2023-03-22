class Solution 
{ 
    static long solve(int X,int Y, String S)
	{    
	    // code here
         long res=0;
        Stack<Character> st = new Stack<>();
        int n=S.length();
        if(X>Y){
            for(int i=0; i<n; i++){
                char cur=S.charAt(i);
                if(st.isEmpty()){
                    st.push(cur); continue;
                }
                if(st.peek()=='p' && cur=='r'){
                    st.pop(); res+=X;
                }else{
                    st.push(cur);
                }
            }
            Stack<Character> right = new Stack<>();
            while(!st.isEmpty()){
                char cur=st.pop();
                if(cur=='r' && (!right.isEmpty() && right.peek()=='p')){
                    right.pop();
                    res+=Y;
                }else{
                    right.push(cur);
                }
            }
            return res;
        }else if(Y>X){
            for(int i=0; i<n; i++){
                char cur=S.charAt(i);
                if(st.isEmpty()){
                    st.push(cur); continue;
                }
                if(st.peek()=='r' && cur=='p'){
                    st.pop(); res+=Y;
                }else{
                    st.push(cur);
                }
            }
            Stack<Character> right = new Stack<>();
            while(!st.isEmpty()){
                char cur=st.pop();
                if(cur=='p' && (!right.isEmpty() && right.peek()=='r')){
                    right.pop();
                    res+=X;
                }else{
                    right.push(cur);
                }
            }
            return res;
        }
        
        for(int i=0; i<n; i++){
            char cur = S.charAt(i);
            if(!st.isEmpty() && ((cur=='p' && st.peek()=='r') || (cur=='r' && st.peek()=='p'))){
                st.pop();
                res+=X;
            }else{
                st.push(cur);
            }
        }
        return res;
	}
} 
