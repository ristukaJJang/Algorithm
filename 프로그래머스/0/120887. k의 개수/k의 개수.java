class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int n = i; n <= j; n++) {
            char[] number = String.valueOf(n).toCharArray();
            for(int test = 0; test < number.length; test++) {
                int num = Character.getNumericValue(number[test]);
                if(num == k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}