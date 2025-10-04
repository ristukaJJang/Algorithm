import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] charBefore = before.toCharArray();
        char[] charAfter = after.toCharArray();
        
        Arrays.sort(charBefore);
        Arrays.sort(charAfter);
        
        
        
        for(int i = 0; i < charBefore.length; i++) {
            if(charBefore[i] != charAfter[i]) {
                return answer;
            }
        }
        
        answer = 1;
        return answer;
    }
}