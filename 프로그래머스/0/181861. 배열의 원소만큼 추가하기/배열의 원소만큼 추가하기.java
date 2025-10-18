class Solution {
    public int[] solution(int[] arr) {
        
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                count++;
            }
        }
        
        int[] answer = new int[count];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                answer[index] = arr[i];
                index++;
            }
        }
        
        return answer;
    }
}