class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] danger = new int[n][n];
        
        // 8방향 탐색용 좌표
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        // 1️⃣ 지뢰 주변 표시
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    danger[i][j] = 1; // 자기 자신도 위험
                    for (int k = 0; k < 8; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        // 범위 체크
                        if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                            danger[nx][ny] = 1;
                        }
                    }
                }
            }
        }

        // 2️⃣ 안전한 칸 개수 세기
        int safeCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (danger[i][j] == 0) safeCount++;
            }
        }

        return safeCount;
    }
}