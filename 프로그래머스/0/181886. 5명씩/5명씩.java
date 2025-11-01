class Solution {
    public String[] solution(String[] names) {
        int count = 0;
        if(names.length % 5 == 0) count = names.length / 5;
        else count = (names.length / 5) + 1;
        String[] answer = new String[count];
        int index = 0;
        for(int i = 0; i < names.length; i++) {
            if(i % 5 == 0) {
                answer[index] = names[i];
                index++;
            }
        }
        return answer;
    }
}