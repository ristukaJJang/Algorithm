class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int gcdNumber = gcd(a, b);
        b /= gcdNumber;
       
        while(b % 2 == 0) b /= 2;
        while(b % 5 == 0) b /= 5;

        if(b == 1) answer = 1; // 유한소수
        else answer = 2; 
        
        return answer;
    }
    
    // 두 수의 최대공약수
    private int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println(a);
        return a;
    }
}