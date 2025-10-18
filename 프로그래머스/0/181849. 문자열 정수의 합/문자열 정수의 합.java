class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] numbers = num_str.toCharArray();
        for(int i = 0; i < numbers.length; i++) {
            answer += Character.getNumericValue(numbers[i]);
        }
        return answer;
    }
}