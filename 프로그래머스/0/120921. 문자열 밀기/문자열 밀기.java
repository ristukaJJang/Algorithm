import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        if(A.equals(B)) return answer;
        
        List<Character> charListA = new ArrayList<>();
        char[] charsA = A.toCharArray();
        
        for (int i = 0; i < A.length(); i++) {
            charListA.add(charsA[i]);
        }
        
        for(int i = 0; i < A.length(); i++) {
            Collections.rotate(charListA, 1);
            answer++;
            
            StringBuilder sb = new StringBuilder();
            for (char c : charListA) sb.append(c);
            String result = sb.toString();
            
            if(result.equals(B)) {
                return answer;
            }else {
                continue;
            }
            
        }
        answer = -1;
        
        return answer;
    }
}