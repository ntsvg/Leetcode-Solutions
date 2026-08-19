class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int [] dp = new int[n+1];
        for(int i = 0;i<n+1;i++){
            dp[i] = -1;
        }
        return Math.min(solve(0,cost,n,dp),solve(1,cost,n,dp));
    }
    public static int solve(int i,int[] cost,int n,int [] dp){
        if (i>=n){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int onestep = cost[i]+solve(i+1,cost,n,dp);
        int twostep = cost[i] + solve(i+2,cost,n,dp);
        dp[i] = Math.min(onestep,twostep);
        return dp[i];
    }
}