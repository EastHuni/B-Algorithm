import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int count = 0;
            for (int j = 1; j < N; j++) {
                for (int k = 1; k < N; k++) {
                    if ((j * j) + (k * k) <= (N*N)){
                        count++;
                    }
                }
            }
            count *= 4;
            count += N * 4; // J 든 K 든 0 일때, 계산
            count += 1; // 0.0
            System.out.println("#" + i + " " + count);
        }

    }
}