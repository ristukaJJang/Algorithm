import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] arr = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, (a, b) -> {
            int diff = Math.abs(a - n) - Math.abs(b - n);
            if (diff == 0) return b - a; // 거리 같으면 큰 수 먼저
            return diff;
        });

        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}