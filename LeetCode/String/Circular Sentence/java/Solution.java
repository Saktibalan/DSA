class Solution {
    public boolean isCircularSentence(String sentence) {
        Stack<Character> st = new Stack<>();
        String s[] = sentence.split(" ");
        int n = s.length;
        char first = s[0].charAt(0);
        char last = s[n-1].charAt(s[n-1].length()-1);
        if(first != last ) return false;
        for(int i = 0 ; i < n-1 ; i ++){
            String s1 = s[i];
            String s2 = s[i+1];
            if(s1.charAt(s1.length()-1) != s2.charAt(0)) return false;
        }
        return true;
    }
}