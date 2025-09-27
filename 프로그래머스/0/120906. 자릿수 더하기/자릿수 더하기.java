class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] chars = String.valueOf(n).toCharArray();
        int[] numbers = new int[chars.length];
        
        for(int i = 0; i < chars.length; i++) {
            answer = answer + Character.getNumericValue(chars[i]);
        }
        return answer;
    }
}