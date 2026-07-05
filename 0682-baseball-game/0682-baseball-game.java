class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack  = new Stack<>();
        for(String op : operations) {
             if(!op.equals("C") && !op.equals("D") && !op.equals("+"))
               stack.push(Integer.parseInt(op));
             else if(op.equals("D")) {
               int t = stack.peek();
               stack.push(t*2); }
            else if(op.equals("C"))
               stack.pop();   
            else if(op.equals("+")) {
               int t = stack.pop();
               int q = stack.peek();
               stack.push(t);
               stack.push(t+q);
             }
        

        }
        int sum = 0 ;
        for(int  c: stack) 
          sum+=c;

        return sum;  
    }
}