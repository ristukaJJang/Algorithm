class Solution {
    public String solution(String bin1, String bin2) {
        int aDecimal = Integer.parseInt(bin1, 2); // a를 10진수로
        int bDecimal = Integer.parseInt(bin2, 2); // b를 10진수로
        int sum = aDecimal + bDecimal;         // 더하기
        return Integer.toBinaryString(sum);    // 다시 이진수 문자열로
    }
}