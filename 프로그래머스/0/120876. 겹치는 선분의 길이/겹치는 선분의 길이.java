import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // 전체 구간의 최소~최대값 찾기
        for(int i = 0; i < lines.length; i++) {
            min = Math.min(min, lines[i][0]);
            max = Math.max(max, lines[i][1]);
        }

        int[] arr = new int[max - min];

        // 선분마다 표시
        for (int i = 0; i < lines.length; i++) {
            int start = lines[i][0]; 
            int end = lines[i][1];   
            
            for (int j = start; j < end; j++) {
                arr[j - min]++; // min을 빼서 배열 인덱스로 변환
            }
        }

        // 2개 이상 겹친 길이 세기
        int overlap = 0;
        for (int v : arr) {
            if (v >= 2) overlap++;
        }

        return overlap;
    }
}