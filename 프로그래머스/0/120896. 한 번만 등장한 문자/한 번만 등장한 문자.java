import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c) count++;
            }
            if (count == 1) answer += c;
        }
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        
       
        
        return String.valueOf(chars);
    }
}