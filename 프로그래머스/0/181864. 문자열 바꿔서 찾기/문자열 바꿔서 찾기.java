class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String change = "";
        
        char[] original = myString.toCharArray();
        for(int i = 0; i < original.length; i++) {
            if(original[i] == 'A') original[i] = 'B';
            else original[i] = 'A';
            change += original[i];
        }
        
        if(change.contains(pat)) answer= 1;
        
        return answer;
    }
}