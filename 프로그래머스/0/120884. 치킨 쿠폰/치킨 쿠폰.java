class Solution {
    public int solution(int chicken) {
        int total = 0; // 총 먹은 치킨
        int coupons = chicken; // 처음 치킨 시킨 수만큼 쿠폰 받음

        while (coupons >= 10) { // 쿠폰 10개 이상이면
            int free = coupons / 10;   // 받을 수 있는 무료 치킨 수
            total += free;             // 총 치킨에 추가
            coupons = coupons % 10 + free; // 남은 쿠폰 + 무료 치킨로 받은 쿠폰
        }

        return total;
    }
}