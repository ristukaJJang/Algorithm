class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i))) {
                sb.append(my_string.charAt(i));
            }
        }
        
        String str = sb.toString();
        int[] arrays = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            arrays[i] = str.charAt(i) - '0';
        }
        
        for(int i = 0; i < arrays.length; i++) {
            answer += arrays[i];
        }
        
        return answer;
    }
}