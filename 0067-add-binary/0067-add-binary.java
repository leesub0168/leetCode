class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int ceil = 0;
        while(i >= 0 || j >= 0) {
            int sum = 0;
            if(i >= 0 && a.charAt(i--) == '1') {
                sum++;
            }
            if(j >= 0 && b.charAt(j--) == '1') {
                sum++;
            }
            if(sum == 2) {
                if(ceil == 1) {
                    sb.insert(0,"1");
                }else {
                    sb.insert(0,"0");
                }
                ceil = 1;
            }else if(sum == 1) {
                if(ceil == 1) {
                    sb.insert(0,"0");
                    ceil = 1;
                }else {
                    sb.insert(0,"1");
                    ceil = 0;
                }
            }else {
                if(ceil == 1) {
                    sb.insert(0,"1");
                    ceil = 0;
                }else {
                    sb.insert(0,"0");
                }
            }
            
        }
        if(ceil == 1) sb.insert(0, "1");
        return sb.toString();
    }
}