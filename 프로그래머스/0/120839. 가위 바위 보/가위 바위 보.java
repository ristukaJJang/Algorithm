class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i = 0; i < rsp.length(); i++) {
            if(Character.getNumericValue(rsp.charAt(i)) == 0 ) 
                answer = answer + "5";
            else if(Character.getNumericValue(rsp.charAt(i)) == 2)
                answer = answer + "0";
            else
                answer = answer + "2";
        }
        return answer;
    }
}