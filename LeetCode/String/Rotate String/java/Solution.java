class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        if(s.equals(goal)) return true;
        for(int i=1;i<n;i++){
            String res1=s.substring(0,i);
            String res2=s.substring(i);
            String ans=res2+res1;
            if(ans.equals(goal)){
                return true;
            }
        }
        return false;
    }
}