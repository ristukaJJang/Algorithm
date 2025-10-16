class Solution {
    public int[] solution(int n) {
        int count = 0;
        int m = n;
        
        while(n != 1) {
            if(n % 2 == 0) n /= 2;
            else n = (3 * n) + 1;
            count++;
        }
        
        int[] answer = new int[count + 1];
        answer[0] = m;
        
        for(int i = 1; i <= count; i++) {
            if(m % 2 == 0) {
                m /= 2;
                answer[i] = m;
            }
            else {
                m = (3 * m) + 1;
                answer[i] = m;
            }
        }
        return answer;
    }
}