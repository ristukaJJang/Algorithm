class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i = 0; i < index_list.length; i++) {
            int number = index_list[i];
            answer += my_string.charAt(number);
        }
        return answer;
    }
}