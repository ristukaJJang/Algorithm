import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        char[] chars = String.valueOf(n).toCharArray();
        int[] numbers = new int[chars.length];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Character.getNumericValue(chars[i]);
        }
        Arrays.sort(numbers);
        
        // 2. 배열 뒤집기
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        
        String num = "";
        for(int i = 0; i < numbers.length; i++) {
            num += String.valueOf(numbers[i]);
        }
        //System.out.println(num);
        answer = Long.parseLong(num);
        return answer;
    }
}