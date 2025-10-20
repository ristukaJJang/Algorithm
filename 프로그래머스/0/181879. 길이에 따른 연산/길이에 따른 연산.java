class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        if(num_list.length >= 11) {
            for(int i = 0; i < num_list.length; i++) answer+= num_list[i];
        }else {
            for(int i = 0; i < num_list.length; i++) {
             multi *= num_list[i];
            }
            return multi;
        }
        return answer;
    }
}