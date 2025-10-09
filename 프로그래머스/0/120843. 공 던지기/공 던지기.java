class Solution {
    public int solution(int[] numbers, int k) {
        int idx = 0; // 공 시작 위치

        // K-1번 이동 (처음 공은 이미 1번에게 있음)
        for (int i = 1; i < k; i++) {
            idx = (idx + 2) % numbers.length; // 한 명 건너뛰고
        }

        return numbers[idx]; // K번째 공 받은 사람 번호
    }
}