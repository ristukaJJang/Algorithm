class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                even = even + num_list[i] + "";
            }else {
                odd = odd + num_list[i] + "";
            }
        }
        
        System.out.println(even);
        System.out.println(odd);
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        
        return answer;
    }
}