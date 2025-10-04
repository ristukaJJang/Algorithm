class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            char[] numbers = String.valueOf(array[i]).toCharArray();
            for(int j = 0; j < numbers.length; j++) {
                if(Character.getNumericValue(numbers[j]) == 7) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}