class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack =new Stack<>();
        char [] c=s.toCharArray();
        for(char ch : c)
        {
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else if(stack.peek()==ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char cc : stack) sb.append(cc);
        return sb.toString();
    }
}