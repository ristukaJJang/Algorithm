class Solution {
    public int solution(String myString, String pat) {
        
        if(pat.length() > myString.length()) return 0;
        
        if(myString.toUpperCase().contains(pat.toUpperCase())) return 1;
        else return 0;
        
        
    }
}