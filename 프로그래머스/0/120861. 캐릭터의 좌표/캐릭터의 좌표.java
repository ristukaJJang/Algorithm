class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int x = 0;
        int y = 0;
        
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("up")) {
                if (y + 1 <= maxY) y++;
            } else if (keyinput[i].equals("down")) {
                if (y - 1 >= -maxY) y--;
            } else if (keyinput[i].equals("right")) {
                if (x + 1 <= maxX) x++;
            } else if (keyinput[i].equals("left")) {
                if (x - 1 >= -maxX) x--;
            }
        }
        
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}