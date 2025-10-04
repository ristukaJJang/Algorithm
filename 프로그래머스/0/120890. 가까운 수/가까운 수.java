import java.util.*;

class Solution {
    public int solution(int[] array, int n) {

        int index = 0;
        int min = Integer.MAX_VALUE;
        int[] distance = new int[array.length];
        
        for(int i = 0; i < array.length; i++) {
            distance[i] = Math.abs(array[i] - n);
        }
        
        Arrays.sort(distance);
        
        for(int i = 0; i < distance.length; i++) {
            if(Math.abs(array[i] - n) == distance[0] ) {
                if(array[i] < min) {
                    min = array[i];
                    index = i;
                }
            }
        }
        
        return array[index];
    
    }
}