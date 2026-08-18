class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<>();
        solve(1,temp,n,k);
        return res;
    }
    public void solve(int i,List<Integer> temp,int n,int k){
        if(temp.size() == k){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(i>n){
            return;
        }
        temp.add(i);
        solve(i+1,temp,n,k);
        temp.remove(temp.size()-1);
        solve(i+1,temp,n,k);
    }
}