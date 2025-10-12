class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for (int i = 0; i < dic.length; i++) {
            String temp = dic[i];  // 원본 word 보존
            
            for (int j = 0; j < spell.length; j++) {
                if (temp.contains(spell[j])) {
                    temp = temp.replaceFirst(spell[j], ""); // ✅ 첫 번째만 제거
                } else {
                    temp = null; // 한 글자라도 없으면 실패
                    break;
                }
            }
            
            if (temp != null && temp.length() == 0) {
                return 1; // 모든 글자 존재
            }
        }
        
        return answer;
    }
}