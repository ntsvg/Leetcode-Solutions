class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n = nums.length;
        for(int remove = 0; remove < n; remove++) {

            boolean increasing = true;
            int prev = -1;

            for(int i = 0; i < n; i++) {

                if(i == remove) {
                    continue;
                }

                if(prev != -1 && nums[prev] >= nums[i]) {
                    increasing = false;
                    break;
                }

                prev = i;
            }

            if(increasing) {
                return true;
            }
        }

        return false;
    }
}