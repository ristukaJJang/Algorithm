class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        if(is_prefix.length() > my_string.length()) return answer;
        
        for(int i = 0; i < is_prefix.length(); i++) {
            if(my_string.charAt(i) == is_prefix.charAt(i)) continue;
            else {
                return answer;
            }
        }
        answer = 1;
        return answer;
    }
}