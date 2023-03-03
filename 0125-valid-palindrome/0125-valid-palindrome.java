class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(Character.isAlphabetic(c) || Character.isDigit(c)) sb.append(c);
        }
        for(int i=0;i<sb.length();i++) {
            if(sb.charAt(i) != sb.charAt(sb.length()-1-i)) return false;
        }
        return true;
    }
}