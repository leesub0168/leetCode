class Solution {
    public int lengthOfLastWord(String s) {
       String sr[] = s.split(" ");
       int len = sr.length;
       return sr[len-1].length();
    }
}