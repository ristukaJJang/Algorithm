class Solution {
    public String[] solution(String my_str, int n) {
        int count = 0;
        if(my_str.length() % n == 0) {
            count = my_str.length() / n;
        }else {
            count = my_str.length() / n + 1;
        }
        
        String[] answer = new String[count];
        char[] chars = my_str.toCharArray();
        
        int index = 0;
        String str = "";
        
        for(int i = 0; i < my_str.length(); i++) {
            str += chars[i];
            if(str.length() == n) {
                answer[index] = str;
                index++;
                str = "";
            }else if(str.length() < n && i == my_str.length() - 1) {
                answer[count - 1] = str;
            }
        }
        
        return answer;
    }
}