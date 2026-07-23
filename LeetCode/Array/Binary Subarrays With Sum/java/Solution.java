class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int s = 0;
            for(int k=i;k<nums.length;k++){
               s += nums[k];
               if(s==goal){
                 c++;
               }
            }
        }
        return c;
    }
}