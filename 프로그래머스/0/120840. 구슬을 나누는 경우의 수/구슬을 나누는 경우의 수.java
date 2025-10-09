import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        if(balls == share) return 1;
        
        BigInteger n = BigInteger.ONE;
        BigInteger m = BigInteger.ONE;
        BigInteger minus = BigInteger.ONE;

        // balls!
        for (int i = 1; i <= balls; i++) {
            n = n.multiply(BigInteger.valueOf(i));
        }

        // share!
        for (int j = 1; j <= share; j++) {
            m = m.multiply(BigInteger.valueOf(j));
        }

        // (balls - share)!
        for (int k = 1; k <= (balls - share); k++) {
            minus = minus.multiply(BigInteger.valueOf(k));
        }

        // 조합 계산: n / (share! * (balls - share)!)
        BigInteger result = n.divide(m.multiply(minus));

        return result.intValue(); // 문제에서 정수 반환
    }
}