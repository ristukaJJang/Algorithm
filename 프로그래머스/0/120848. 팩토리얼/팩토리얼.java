class Solution {
    public int solution(int n) {
        int answer = 1;
        int count = 0;
        
        while(answer <= n) {
            count++;
            answer = factorial(answer, count);
        }
        
        return --count;
    }
    
    public int factorial(int answer, int count) {
        return answer * count;
    }
}