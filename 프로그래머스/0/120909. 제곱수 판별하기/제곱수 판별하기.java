class Solution {
    public int solution(int n) {
        int answer = 0;
        double squrt = Math.sqrt(n);
        
        if(squrt % 1 == 0) answer = 1;
        else answer = 2;
        return answer;
    }
}