class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numberSum = (numer1 * denom2) + (numer2 * denom1);
        int demonMulti = denom1 * denom2;
        
        int gcd = gcd(Math.abs(numberSum), Math.abs(demonMulti)); // 절댓값으로 GCD
        
        answer[0] = numberSum / gcd;
        answer[1] = demonMulti / gcd;
        
        return answer;
    }
    
    // 유클리드 호제법
    private int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}