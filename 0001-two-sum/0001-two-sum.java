import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++) {
            Integer idx = map.get(target - nums[i]);
            if(idx != null && idx != i) {
                return new int[] {idx, i};
            }
        }
        return arr;
    }
}