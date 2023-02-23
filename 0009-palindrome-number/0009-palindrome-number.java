class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuffer sb = new StringBuffer(s);

        return s.equals(sb.reverse().toString());
    }
}