import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        Stack<String> stack = new Stack();
        
        for(int i = 0; i < str.length; i++) {
            stack.push(str[i]);
            if(stack.peek().equals("Z")) {
                stack.pop();
                stack.pop();
            }
        }
        
        while (!stack.isEmpty()) {
            int number = Integer.parseInt(stack.pop());
            answer += number;
        }

        return answer;
    }
}