class Solution {
    public static int finLength(int N, int[] color, int[] radius) {
        // code here
         Stack<Integer> stack = new Stack<>(); // create a stack to store ball indices
    for (int i = 0; i < N; i++) { // iterate over all balls
        if (!stack.isEmpty() && // check if the stack is not empty and
            color[i] == color[stack.peek()] && // the current ball has the same color as the top ball in the stack and
            radius[i] == radius[stack.peek()]) { // the current ball has the same radius as the top ball in the stack
            stack.pop(); // remove the top ball from the stack
        } else {
            stack.push(i); // add the current ball to the stack
        }
    }
    return stack.size(); 
    }
}
   