class Solution {
    public String solution(String myString) {
        char[] chars = myString.toCharArray();
        String answer = "";
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == 'a' || chars[i] == 'A') chars[i] = 'A';
            else chars[i] = Character.toLowerCase(chars[i]);
            answer += chars[i];
        }
        
       
        return answer;
    }
}