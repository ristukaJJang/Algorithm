class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() == 1) return s;
        
        if(s.length() % 2 != 0) return String.valueOf(s.charAt(s.length() / 2));
        else {
            answer = answer + String.valueOf(s.charAt((s.length() / 2) - 1));
            answer = answer + String.valueOf(s.charAt((s.length() / 2)));
        }
        
        return answer;
    }
}