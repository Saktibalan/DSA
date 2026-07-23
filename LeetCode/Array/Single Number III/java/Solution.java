class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        int arr[]=new int[2];
        for(int a : nums){
            m.put(a,m.getOrDefault(a,0)+1);
        }
        int i=0;
        for(int b : nums){
            if(m.get(b)==1)
            arr[i++]=b;
        }
        return arr;
    }
}