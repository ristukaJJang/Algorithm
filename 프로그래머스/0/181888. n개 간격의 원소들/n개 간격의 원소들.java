class Solution {
    public int[] solution(int[] num_list, int n) {
        int count = 0;
        if(num_list.length % n == 0) count = num_list.length / n;
        else count = num_list.length / n + 1;
        
        int[] answer = new int[count];
        int index = 0;
        for(int i = 0; i < num_list.length; i = i + n) {
            answer[index] = num_list[i];
            index++;
        }
        return answer;
    }
}