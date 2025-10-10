class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int garo = 0;
        int sero = 0;
        
        for(int i = 1; i < dots.length; i++) {
            if(dots[0][0] == dots[i][0]) garo = Math.abs((dots[0][1] - dots[i][1]));
            if(dots[0][1] == dots[i][1]) sero = Math.abs((dots[0][0] - dots[i][0]));   
        }
        
        answer = garo * sero;
        return answer;
    }
}