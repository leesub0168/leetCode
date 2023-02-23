class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        int[] arr = new int[1002];
        arr['I'] = 1; arr['V'] = 5; arr['X'] = 10;
        arr['L'] = 50; arr['C'] = 100; arr['D'] = 500;
        arr['M'] = 1000;
        int answer = 0;
        
        for(String key : map.keySet()) {
            if(s.indexOf(key) >= 0) {
                answer += map.get(key);
                s = s.replaceAll(key,"");
            }
        }
        for(int i=0;i<s.length();i++) {
            answer += arr[s.charAt(i)];
        }
        return answer;
        
    }
}