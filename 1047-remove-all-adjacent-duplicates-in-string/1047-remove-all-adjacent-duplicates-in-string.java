class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>() ; 
        for(char c : s.toCharArray())
        {
            if(!stack.isEmpty()) {
               char t = stack.peek();
            if(t != c)
              stack.push(c);
            else stack.pop();  
            }
            else {
                stack.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char ch: stack)
           ans.append(ch);

        return ans.toString();   
    }
}