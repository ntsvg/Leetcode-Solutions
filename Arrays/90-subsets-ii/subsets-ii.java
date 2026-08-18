class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       List<Integer> temp = new ArrayList<>();
       solve(0,temp,nums);
       return res; 
    }
    public void solve(int i,List<Integer> temp,int [] nums){
        if(i == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        solve(i+1,temp,nums);
        temp.remove(temp.size()-1);
        while(i+1 < nums.length && nums[i] == nums[i+1]){
            i += 1;
        }
        solve(i+1,temp,nums);
    }
}