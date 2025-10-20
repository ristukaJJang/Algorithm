class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        int a = intervals[0][1] - intervals[0][0] + 1;
        int b = intervals[1][1] - intervals[1][0] + 1;
        
        int index = 0;
        int[] answer = new int[a + b];
        
        // 첫 번째 구간 복사
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            answer[index] = arr[i];
            index++;
        }
        
        // 두 번째 구간 복사
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            answer[index] = arr[i];
            index++;
        }
        
        return answer;
    }
}