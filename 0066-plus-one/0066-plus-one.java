class Solution {
    public int[] plusOne(int[] digits) {
        int last = digits.length - 1;
        Set<Integer> set = new HashSet<>();
        if(digits[last] == 9){
            int add = 0;
            for(int i=last;i>=0;i--) {
                if(i == last) {
                    add = 1;
                    digits[i] = 0;
                }else {
                    if(digits[i] == 9 && add == 1) {
                        add = 1;
                        digits[i] = 0;
                    }else {
                        add = 0;
                        digits[i] = digits[i] + 1;
                        break;
                    }
                }
            }
            if(add == 1) {
                int[] arr = new int[digits.length+1];
                arr[0] = add;
                return arr;
            }else {
                return digits;
            }
        }else {
            digits[last] = digits[last] + 1;
            return digits;
        }
    }
}