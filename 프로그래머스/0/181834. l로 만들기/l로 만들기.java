class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] str = myString.toCharArray();
        for(int i = 0; i < myString.length(); i++) {
            if(str[i] < 108) str[i] = 'l'; 
            answer += str[i];
        }
        //answer = str.toString();
        return answer;
    }
}