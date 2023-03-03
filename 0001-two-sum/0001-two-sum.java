import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Hashtable<Integer, Integer> table = new Hashtable<>();
        for(int i=0;i<nums.length;i++) {
            table.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++) {
            if(table.get(target - nums[i]) != null && table.get(target - nums[i]) != i) {
                arr[0] = table.get(target - nums[i]);
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}