class Solution {
    public int[] solution(String myString) {
        
        String[] oohes = myString.split("x", -1);
        int[] answer = new int[oohes.length];
        for(int i = 0; i < oohes.length; i++) {
            answer[i] = oohes[i].length();
        }
        return answer;
    }
}