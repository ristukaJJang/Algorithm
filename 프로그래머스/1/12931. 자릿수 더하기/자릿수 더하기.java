import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        char[] chars = String.valueOf(n).toCharArray();
        for(int i = 0; i < chars.length; i++) {
            int number = Character.getNumericValue(chars[i]);
            answer += number;
        }

        return answer;
    }
}