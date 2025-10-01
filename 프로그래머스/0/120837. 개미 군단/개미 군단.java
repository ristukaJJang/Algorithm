class Solution {
    public int solution(int hp) {
        int answer = 0;

        int cap = hp / 5; 
        int solider = (hp % 5) / 3; 
        
        int slave = 0;
        if( (hp % 5) % 3 != 0 ) slave = (hp % 5) % 3;

        
        answer = cap + solider + slave;
        
        return answer;
    }
}