class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index = 0;
        
        // n번째 이후 원소들 먼저 넣기
        for(int i = n; i < num_list.length; i++) {
            answer[index++] = num_list[i];
        }
        
        // n번째까지 원소들 뒤에 붙이기
        for (int i = 0; i < n; i++) {
            answer[index++] = num_list[i];
        }
        return answer;
    }
}