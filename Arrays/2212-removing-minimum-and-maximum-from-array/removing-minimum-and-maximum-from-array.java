class Solution {
    public int minimumDeletions(int[] nums) {
        int minIdx = 0;
        int maxIdx = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] < nums[minIdx]){
                minIdx = i;
            }
            if(nums[i] > nums[maxIdx]){
                maxIdx = i;
            }
        }
        int left = Math.min(minIdx,maxIdx);
        int right = Math.max(minIdx,maxIdx);
        int bothleft = right+1;
        int bothright = nums.length- left;
        int sol = (left+1) + (nums.length-right);
        return Math.min(sol,Math.min(bothleft,bothright)); 
    }
}