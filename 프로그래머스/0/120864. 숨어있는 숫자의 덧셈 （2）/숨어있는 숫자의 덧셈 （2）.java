class Solution {
    public int solution(String my_string) {
        int sum = 0;
        String[] arr = my_string.split("[^0-9]"); // 숫자가 아닌 것 기준 split
        for (String s : arr) {
            if (!s.equals("")) { // 빈 문자열 무시
                sum += Integer.parseInt(s);
            }
        }
        return sum;
    }
}