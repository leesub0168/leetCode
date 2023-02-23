class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        List<Character> list = new ArrayList<>();
        list.add('('); list.add('{'); list.add('[');
        for(int i=0;i<arr.length;i++) {
            if(list.indexOf(arr[i]) >= 0) stack.push(arr[i]);
            else {
                if(stack.isEmpty()) return false;
                char top = stack.peek();
                if(top == '(' && arr[i] == ')') {
                    stack.pop();
                }else if(top == '{' && arr[i] == '}') {
                    stack.pop();
                }else if(top == '[' && arr[i] == ']') {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}