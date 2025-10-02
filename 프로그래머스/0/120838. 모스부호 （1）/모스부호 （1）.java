class Solution {
    public String solution(String letter) {
        
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                          ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                          "...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] morseChar = letter.split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        int index = 0;
        for(int i = 0; i < morseChar.length; i++) {
            for(int j = 0; j < morse.length; j++) {
                if(morseChar[i].equals(morse[j])) {
                    sb.append((char) ('a' + j)); // 'a'(97)에 j를 더해서 알파벳으로 변환
                    break;
                }
            }
        }
        
        
        
        return sb.toString();
    }
}