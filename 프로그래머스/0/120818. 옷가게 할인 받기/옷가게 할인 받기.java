class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price < 100000) answer = price;
        else if(100000 <= price && price <= 299999) answer = (int)(price * 0.95);
        else if(300000 <= price && price <= 499999) answer = (int)(price * 0.9);
        else answer = (int)(price * 0.8);
        return answer;
    }
}