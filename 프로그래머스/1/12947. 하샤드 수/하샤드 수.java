class Solution {
    public boolean solution(int x) {
        
        char[] number = String.valueOf(x).toCharArray();
        int sum = 0;

        for(int i = 0; i < number.length; i++) {
            sum += Character.getNumericValue(number[i]);
        }
        
        if(x % sum == 0) return true;
        else return false;
    }
}