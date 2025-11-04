import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            int[] ans = {-1};
            return ans;
        }
        
        int[] answer = new int[arr.length - 1];
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) min = arr[i];
        }
        //System.out.println(min);
        
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) continue;
            else {
                answer[index] = arr[i];
                index++;
            }
        }
        
        return answer;
    }
}