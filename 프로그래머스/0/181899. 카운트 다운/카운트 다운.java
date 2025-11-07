class Solution {
    public int[] solution(int start_num, int end_num) {
        int number = start_num - end_num + 1;
        int[] answer = new int[number];
        int index = 0;
        for(int i = start_num; i >= end_num; i--) {
            answer[index] = i;
            index++;
        }
        return answer;
    }
}