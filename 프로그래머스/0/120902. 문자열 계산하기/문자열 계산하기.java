class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int result = Integer.parseInt(str[0]);

        for (int i = 1; i < str.length; i += 2) {
            String op = str[i];      // 연산자
            int num = Integer.parseInt(str[i + 1]); // 숫자
            if (op.equals("+")) result += num;
            else if (op.equals("-")) result -= num;
        }
        
        return result;
    }
}