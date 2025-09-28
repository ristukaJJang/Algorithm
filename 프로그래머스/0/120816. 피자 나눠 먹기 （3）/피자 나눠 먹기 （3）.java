class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        if(n % slice == 0) answer = n / slice;
        else if(slice >= n) answer = 1;
        else answer = n / slice + 1;
        
        return answer;
    }
}