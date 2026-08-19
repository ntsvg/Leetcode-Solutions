class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve(res,n,"",0,0);
        return res;
    }
    public static void solve(List<String> res,int n,String temp,int open,int close){
        if(temp.length()== 2*n){
            res.add(temp);
            return;
        }
        if(open < n){
            solve(res,n,temp+"(",open+1,close);
        }
        if(close<open){
            solve(res,n,temp+")",open,close+1);
        }
    }
}