class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<Integer> temp = new ArrayList<>();
      int sum = 0;
      solve(0,temp,candidates,sum,target);
      return res;
    }
    public void solve(int i,List<Integer> temp,int [] candidates,int sum,int target){
        if(sum == target){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(sum > target || i>=candidates.length){
            return;
        }
        temp.add(candidates[i]);
        solve(i,temp,candidates,sum+candidates[i],target);
        temp.remove(temp.size()-1);
        solve(i+1,temp,candidates,sum,target);
    }
}