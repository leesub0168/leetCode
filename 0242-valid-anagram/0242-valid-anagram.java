class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            list.add(s.charAt(i));
        }
        
        for(int i=0;i<t.length();i++) {
            int idx = list.indexOf(t.charAt(i));
            if(idx >= 0) list.remove(idx);
        }
        return (list.size() > 0)? false:true;
    }
}