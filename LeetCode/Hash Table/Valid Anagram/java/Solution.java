class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        String [] S=s.split("");
        String [] T=t.split("");
        Arrays.sort(S);
        Arrays.sort(T);
        for(int i=0;i<S.length;i++){
            if((!(S[i]).equals(T[i]))){
                return false;
            }
        }
        return true;
    }
}