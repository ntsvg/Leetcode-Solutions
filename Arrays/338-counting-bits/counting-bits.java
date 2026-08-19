class Solution {
    public int[] countBits(int n) {
        int [] count = new int[n+1];
        for(int i = 1;i<n+1;i++){
            count[i] = solve(i);
        }
        return count;
    }
    public static int solve(int n){
        int c = 0;
        while(n>0){
            n = n&n-1;
            c++;
        }
        return c;
    }
}