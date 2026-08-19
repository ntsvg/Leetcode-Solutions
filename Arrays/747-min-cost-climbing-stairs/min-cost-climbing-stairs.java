class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n==2){
            return Math.min(cost[0],cost[1]);
        }
        for(int i = 2;i<n;i++){
            int onestep = cost[i] + cost[i-1];
            int twosteps = cost[i] + cost[i-2];
            cost[i] = Math.min(onestep,twosteps);
        }
        return Math.min(cost[n-1],cost[n-2]);
    }
}