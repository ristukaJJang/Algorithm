class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] chars = String.valueOf(order).toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(Character.getNumericValue(chars[i]) % 3 == 0 && 
              Character.getNumericValue(chars[i]) != 0) answer++;
            else continue;
        }
        return answer;
    }
}