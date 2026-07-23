class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int a : nums){
            m.put(a,m.getOrDefault(a,0)+1);
        }
        for(int b : nums){
            if(m.get(b)==1){
                return b;
            }
        }
        return 0;
    }
}