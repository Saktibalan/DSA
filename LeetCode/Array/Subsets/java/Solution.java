class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>());
        for(int c : nums){
            int d=arr.size();
            for(int i=0;i<d;i++){
                List<Integer> z=new ArrayList<>(arr.get(i));
                z.add(c);
                arr.add(z);
            }
        }
        return arr;
    }
}