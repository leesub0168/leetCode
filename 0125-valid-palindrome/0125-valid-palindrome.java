class Solution {
    public boolean isPalindrome(String s) {
        String lowerS = s.toLowerCase();
        if(s.length() == 1) return true;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<lowerS.length();i++) {
            char c = lowerS.charAt(i);
            if(Character.isAlphabetic(c) || Character.isDigit(c)) sb.append(c);
        }
        String[] arr = sb.toString().split("");
        for(int i=0;i<arr.length;i++) {
            if(!arr[i].equals(arr[arr.length - 1 - i])) return false;
        }
        return true;
    }
}