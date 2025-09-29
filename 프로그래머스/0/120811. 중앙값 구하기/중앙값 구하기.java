import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int half = (int)Math.floor(array.length / 2);
        for(int i = 0; i < array.length; i++) {
            if(i == half) {
                answer = array[i];
                break;
            }
        }
        return answer;
    }
}