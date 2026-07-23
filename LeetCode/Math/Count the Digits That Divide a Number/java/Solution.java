class Solution {
    public int countDigits(int num) {
        int a=num;
        int count=0;
        int d=0;
        while(a>0){
            d=a%10;
            if(num%d==0){
                count++;
            }
            a/=10;
        }
        return count;
    }
}