public class Make the array beautiful {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
         if(arr.length==0){
            return new ArrayList<>();
        }
        if(arr.length==1){
            ArrayList<Integer> al=new ArrayList<>();
            al.add(arr[0]);
            return al;
        }
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        int i=1;
        
        while(i<arr.length){
            if(st.isEmpty()){
                st.push(arr[i]);
            }
            else if((st.peek()<0 && arr[i]<0) || (st.peek()>=0 && arr[i]>=0)){
                st.push(arr[i]);
            }
            else if((st.peek()<0 && arr[i]>=0) || (st.peek()>=0 && arr[i]<0)){
                st.pop();
            }
            i++;
        }
        ArrayList<Integer> res=new ArrayList<>();
        while(!st.isEmpty()){
            res.add(st.pop());
        } 
        Collections.reverse(res);
        return res;
    }
}
