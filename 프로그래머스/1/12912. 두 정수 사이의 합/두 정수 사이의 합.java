class Solution {
    public long solution(int a, int b) {
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        long n = max - min + 1;                // 항의 개수
        return (min + max) * n / 2;
    }
}