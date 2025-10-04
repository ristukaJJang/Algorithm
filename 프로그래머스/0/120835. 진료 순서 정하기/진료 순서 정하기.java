import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sorted = emergency.clone(); // 복사
        Arrays.sort(sorted); // 오름차순 정렬
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            
            // 점수가 높은 순서대로 등수 부여
            map.put(sorted[i], sorted.length - i);
        }
        
        int[] answer = new int[sorted.length];
        for (int i = 0; i < sorted.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        
        return answer;
    }
}