class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        String[] arr = new String[200];
        int idx = 0;
        while(idx < strs[0].length()) {
            arr[idx] = String.valueOf(strs[0].charAt(idx));
            for(int i=0;i<strs.length;i++) {
                if(strs[i].length() <= idx) {
                    return sb.toString();
                }
                if(strs[i].length() > idx && !arr[idx].equals(String.valueOf(strs[i].charAt(idx)))) {
                    return sb.toString();
                }
            }
            sb.append(arr[idx]);
            idx++;
        }
        
        return sb.toString();
    }
}