import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        boolean duplicated = false;
        
        // 각 숫자의 등장 횟수 세기
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int maxKey = -1;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
                duplicated = false; // 새 최대값 발견 → 중복 초기화
            } else if (value == maxValue) {
                duplicated = true; // 같은 최대값 또 나옴 → 중복 표시
            }
        }
        
        answer = duplicated ? -1 : maxKey; // ✅ 수정된 부분
        
        return answer;
    }
}