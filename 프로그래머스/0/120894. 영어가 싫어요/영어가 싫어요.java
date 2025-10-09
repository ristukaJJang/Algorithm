class Solution {
    public long solution(String numbers) {
        String[] nums = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String s = numbers; // ← 원본을 저장하고 이어서 치환
        
        for (int i = 0; i < 10; i++) {
            s = s.replace(nums[i], String.valueOf(i));
        }
        
        return Long.parseLong(s); // int가 아니라 long 사용
    }
}