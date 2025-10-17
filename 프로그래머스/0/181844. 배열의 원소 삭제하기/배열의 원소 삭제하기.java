class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    arr[i] = 0;
                    count++;
                }
            }
        }

        int[] answer = new int[arr.length - count];
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                answer[index] = arr[i];
                index++;
            }
        }
        
        return answer;
    }
}