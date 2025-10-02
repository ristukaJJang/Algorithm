class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n == 1) answer = 0;
        
        for (int i = 1; i <= n; i++) {
            int count = 0; // 약수 개수 세기
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count >= 3) answer++; // 합성수라면 카운트
        }
        return answer;
    }
}

