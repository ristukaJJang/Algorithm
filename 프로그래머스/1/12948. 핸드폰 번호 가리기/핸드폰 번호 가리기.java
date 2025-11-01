class Solution {
    public String solution(String phone_number) {
        String answer = "";
        if(phone_number.length() == 4) return phone_number;
        
        for(int i = 0; i < phone_number.length() - 4; i++) {
            answer += '*';
        }
        
        for(int i = phone_number.length() - 4; i < phone_number.length(); i++) {
            answer += phone_number.charAt(i);
        }
        return answer;
    }
}