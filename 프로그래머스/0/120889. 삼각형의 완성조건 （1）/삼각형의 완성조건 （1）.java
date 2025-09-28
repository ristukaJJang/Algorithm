import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int max = sides[sides.length - 1];
        int answer = 0;
        if(max < sides[0] + sides[1]) answer = 1;
        else answer = 2;
        return answer;
    }
}