class Solution {
    public String solution(int age) {
        String answer = "";
        
        char[] chars = String.valueOf(age).toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == '0') answer += "a";
            else if(chars[i] == '1') answer += "b";
            else if(chars[i] == '2') answer += "c";
            else if(chars[i] == '3') answer += "d";
            else if(chars[i] == '4') answer += "e";
            else if(chars[i] == '5') answer += "f";
            else if(chars[i] == '6') answer += "g";
            else if(chars[i] == '7') answer += "h";
            else if(chars[i] == '8') answer += "i";
            else if(chars[i] == '9') answer += "j";
        }
        
        
        return answer;
    }
}