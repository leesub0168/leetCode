import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Hashtable<Integer, Integer> table = new Hashtable<>();
        for(int i=0;i<nums.length;i++) {
            table.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++) {
            Integer idx = table.get(target - nums[i]);
            if(idx != null && idx != i) {
                return new int[] {idx, i};
            }
        }
        return arr;
    }
}