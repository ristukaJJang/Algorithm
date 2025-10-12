class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++) {
            String[] formula = quiz[i].split(" ");
            
            int firstNum = Integer.parseInt(formula[0]);
            int secondNum = Integer.parseInt(formula[2]);
            int thirdNum = Integer.parseInt(formula[4]);
            
            if(formula[1].equals("-")) {
                int result = firstNum - secondNum;
                if(result == thirdNum) answer[i] = "O";
                else answer[i] = "X";
                
            }else {
                int result = firstNum + secondNum;
                if(result == thirdNum) answer[i] = "O";
                else answer[i] = "X";
            }
            
        }
        return answer;
    }
}