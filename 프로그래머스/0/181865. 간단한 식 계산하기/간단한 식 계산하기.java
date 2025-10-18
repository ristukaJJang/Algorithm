class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] hang = binomial.split(" ");
        int first = Integer.parseInt(hang[0]);
        int second = Integer.parseInt(hang[2]);
        
        if(hang[1].equals("+")) answer =  first + second;
        else if(hang[1].equals("-")) answer =  first - second;
        else answer = first * second;
        
        return answer;
    }
}