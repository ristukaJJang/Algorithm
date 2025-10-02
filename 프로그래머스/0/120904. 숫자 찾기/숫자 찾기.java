class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        char[] chars = String.valueOf(num).toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(Character.getNumericValue(chars[i]) == k) {
                answer = i + 1;
                break;
            }else continue;
        }
        return answer;
    }
}