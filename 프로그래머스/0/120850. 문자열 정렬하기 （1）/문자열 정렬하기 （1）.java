import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i))) {
                stringBuilder.append(my_string.charAt(i));
            }
        }
        
        String str = stringBuilder.toString();
        int[] answer = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(i) - '0'; // 문자 → 숫자 변환
        }
        
        Arrays.sort(answer);
        return answer;
    }
}