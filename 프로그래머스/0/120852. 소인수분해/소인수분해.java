import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new TreeSet<>(); // 중복 제거 + 오름차순 정렬

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        if (n > 1) set.add(n); // 마지막 소인수 추가

        // Set → int[]
        int[] answer = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            answer[idx++] = num;
        }

        return answer;
    }
}