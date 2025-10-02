class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }    
        }
        answer = sb.toString();
        return answer;
    }
}