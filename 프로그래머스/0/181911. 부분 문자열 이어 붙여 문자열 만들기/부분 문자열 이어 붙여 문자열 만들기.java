class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_strings.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];
            
            // substring은 끝 인덱스는 포함 안 하니까 +1 해줘야 함
            sb.append(my_strings[i].substring(s, e + 1));
        }
        
        return sb.toString();
    }
}