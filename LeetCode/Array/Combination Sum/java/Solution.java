class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

   List<List<Integer>> result = new ArrayList<>();
   backtrack(candidates,target,result,new ArrayList<>(),0,0);
   return result;


    }

    public static void backtrack(int [] candidates , int target , List<List<Integer>> result, 
    List<Integer> curr,int sum , int start  ){

          if( sum > target) return ;

          if (sum == target){
            result.add(new ArrayList<>(curr));
            return;
          }

          for(int i = start ; i < candidates.length; i++){
            curr.add(candidates[i]);
            backtrack(candidates,target,result,curr,sum+candidates[i],i);
            curr.remove(curr.size()-1);
          }

        
    }
}