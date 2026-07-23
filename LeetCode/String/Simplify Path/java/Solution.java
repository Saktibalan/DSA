class Solution {
    public String simplifyPath(String path) {
       String dir[] = path.split("/");
       Stack<String> st = new Stack<>();
       for(String word : dir)
       {
        if(word.equals("") || word.equals(".")) continue;
        else if(!st.isEmpty() && word.equals("..")) st.pop();
        else if(word.equals("..")) continue;
        else st.push(word);
       }
       if(st.isEmpty()) return "/";
       StringBuilder sb = new StringBuilder();
       for(String s : st) sb.append("/").append(s);
       return sb.toString(); 
    }
}