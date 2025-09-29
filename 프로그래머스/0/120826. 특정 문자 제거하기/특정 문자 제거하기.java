class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] replaces = {letter};
        if(my_string.contains(replaces[0])) answer = my_string.replaceAll(replaces[0], "");
        else answer = my_string;
        return answer;
    }
}