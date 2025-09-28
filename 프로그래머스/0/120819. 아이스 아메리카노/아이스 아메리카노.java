class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int glass = 0;
        
        if(money < 5500) {
            answer[0] = 0;
            answer[1] = money;
        } else if(money == 5500) {
            answer[0] = 1;
            answer[1] = 0;
        } else {
            while(money >= 5500) {
                money -= 5500;
                glass++;
            }
            answer[0] = glass;
            answer[1] = money;
        }
        
        return answer;
    }
}