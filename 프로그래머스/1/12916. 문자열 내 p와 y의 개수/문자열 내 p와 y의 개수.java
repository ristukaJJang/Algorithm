class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        char[] chars = s.toLowerCase().toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == 'p') pCount++;
            else if(chars[i] == 'y') yCount++;
        }
    
        if(pCount != yCount) answer = false; 
        

        return answer;
    }
}