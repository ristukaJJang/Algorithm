import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0 && i * (n / i) == n) {
                count++;
            }
        }
        
        int[] answer = new int[count];
        int index = 0;
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0 && i * (n / i) == n) {
                answer[index] = i;
                index++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}