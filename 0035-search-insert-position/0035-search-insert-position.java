class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[0] > target) return 0;
        int idx = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) return i;
            else if(nums[i] < target) {
                idx = i;
            }
        }
        return idx+1;
    }
}