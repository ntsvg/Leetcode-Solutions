class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
        if(sum > target || i>=candidates.length ){
            return;
        }
        temp.add(candidates[i]);
        solve(i+1,temp,candidates,sum+candidates[i],target);
        temp.remove(temp.size()-1);
        while(i+1 < candidates.length && candidates[i] == candidates[i+1]){
            i+=1;
        }
        solve(i+1,temp,candidates,sum,target);
    }

}