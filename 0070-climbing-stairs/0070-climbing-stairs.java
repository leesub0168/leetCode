class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[50];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 5;

        for(int i=5;i<=n;i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}