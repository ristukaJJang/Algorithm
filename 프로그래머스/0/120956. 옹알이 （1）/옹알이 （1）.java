class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] validWords = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++) {
            String temp = babbling[i];
            String prev = "";
            boolean valid = true;

            while(!temp.isEmpty()) {
                boolean matched = false;

                for(int j = 0; j < validWords.length; j++) {
                    if(temp.startsWith(validWords[j]) && !validWords[j].equals(prev)) {
                        temp = temp.substring(validWords[j].length()); // 단어 제거
                        prev = validWords[j]; // 이전 단어 갱신
                        matched = true;
                        break;
                    }
                }

                if(!matched) { // 어떤 단어도 안 맞으면 invalid
                    valid = false;
                    break;
                }
            }

            if(valid) answer++;
        }

        
        return answer;
    }
}