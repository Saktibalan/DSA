class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String c : operations){
            char middle=c.charAt(1);
            if(middle=='+'){
                x+=1;
            }
            else{
                x-=1;
            }
        }
        return x;
    }
}