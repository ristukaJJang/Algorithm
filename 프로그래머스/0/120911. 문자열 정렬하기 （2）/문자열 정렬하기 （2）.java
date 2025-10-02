import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
        char[] chars = my_string.toCharArray();

        Arrays.sort(chars);
        for(int i = 0; i < chars.length; i++) {
            answer += chars[i];
        }
        return answer;
    }
}