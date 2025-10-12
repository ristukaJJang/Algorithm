class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        
        
        
        
        if(common[2] - common[1] == common[1] -common[0]) {
            // 등차수열 a[n+1] = a[n] + d
            int d = common[1] - common[0];
            answer = common[common.length - 1] + d;
        }else {
            // 등비수열 a[n+1] = a[n] * r    
            int r = common[2] / common[1];
            answer = common[common.length - 1] * r;
        }
        
        return answer;
    }
}