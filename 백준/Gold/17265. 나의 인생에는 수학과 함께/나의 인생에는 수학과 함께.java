import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static String[][] grid;
    static int maxResult = Integer.MIN_VALUE;
    static int minResult = Integer.MAX_VALUE;

    static class Node{
        int x, y;       // 현재 위치
        int value;      // 현재까지 계산된 값
        char op; 

        Node(int x, int y, int value, char op) {
            this.x = x;
            this.y = y;
            this.value = value;
            this.op = op;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());

        grid = new String[N][N];
        for(int i = 0; i < N; i++) {
            grid[i] = bufferedReader.readLine().split(" ");
        }

        bfs();

        System.out.println(maxResult + " " + minResult);
    }

    static void bfs() {
        Queue<Node> queue = new LinkedList<>();
        // 시작점: (0,0) 숫자니까 op는 '+'로 임시 초기화
        queue.add(new Node(0, 0, Integer.parseInt(grid[0][0]), '+'));

        int[] dx = {1, 0};  // 아래
        int[] dy = {0, 1};  // 오른쪽

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int x = node.x;
            int y = node.y;
            int val = node.value;
            char op = node.op;

            // 목표 지점 도달
            if (x == N - 1 && y == N - 1) {
                maxResult = Math.max(maxResult, val);
                minResult = Math.min(minResult, val);
                continue;
            }

            for (int dir = 0; dir < 2; dir++) {
                int nx = x + dx[dir]; 
                int ny = y + dy[dir]; 
                if (nx >= N || ny >= N) continue;
                // dir = 0일 때,
                // int nx = x 좌표값  + dx[0](= 1)
                // int ny = y 좌표값 + dy[0](= 0)
                // => 아래로 이동

                // dir = 1일 때,
                // int nx = x 좌표값 + dx[1](= 0)
                // int ny = y 좌표값 + dy[1](= 1)
                // => 오른쪽으로 이동

                String next = grid[nx][ny];

                // 숫자면 계산해서 다음 노드로
                if (next.matches("\\d+")) {
                    int num = Integer.parseInt(next);
                    int nextVal = calc(val, num, op);
                    queue.add(new Node(nx, ny, nextVal, '+')); // 다음 숫자 이후의 연산자를 op로 저장
                } 
                // 연산자면 다음 연산자로 저장
                else {
                    queue.add(new Node(nx, ny, val, next.charAt(0)));
                }
            }
        }
    }

    static int calc(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
        }
        return 0; // 여기는 오지 않음
    }
}
