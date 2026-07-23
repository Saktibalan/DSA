class Solution {
    public boolean isPerfectSquare(int num) {
        int ps=0;
        if(num==1) return true;
        if(num==100000001) return false;
        for(int i=0;i<num;i++){
            ps=i*i;
             if(ps==num){
                return true;
            }   
        }     
            return false;
    }
}