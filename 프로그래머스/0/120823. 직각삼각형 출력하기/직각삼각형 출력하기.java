import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {          // i = 현재 줄 번호
            for (int j = 1; j <= i; j++) {      // j = 별 개수
                System.out.print("*");
            }
            System.out.println();               // 줄바꿈
        }

        
    }
}