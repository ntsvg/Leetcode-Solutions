class Solution {
    public int[] countBits(int n) {
        int [] count = new int[n+1];
        for(int i = 1;i<n+1;i++){
            if(i%2 == 0){
                count[i] = count[i/2];
            }
            else{
                count[i] = count[i/2]+1;
            }
        }
        return count;
    }
}