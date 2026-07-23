class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(m.containsKey(a)){
                if(m.get(a)!=b){
                    return false;
                }
            }
            else{
                if(m.containsValue(b)){
                    return false;
                }
            }
            m.put(a,b);
        }
    return true;
    }
}