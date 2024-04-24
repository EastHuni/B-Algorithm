import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int [][] check = new int[N][N];
            int answer = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    check[i][j] = sc.nextInt();
                }
            }
            //행검사
            for (int i = 0; i < N; i++) {
                int count = 0;
                for (int j = 0; j < N; j++) {
                    if (check[i][j] == 0){
                        if (count == K){
                            answer += 1;
                        }
                        count = 0;
                    }else count += 1;
                }
                if (count == K){
                    answer += 1;
                }
            }
            //열검사
            for (int i = 0; i < N; i++) {
                int count = 0;
                for (int j = 0; j < N; j++) {
                    if (check[j][i] == 0){
                        if (count == K){
                            answer += 1;
                        }
                        count = 0;
                    }else count += 1;
                }
                if (count == K){
                    answer += 1;
                }
            }
            System.out.println("#" + test_case + " " + answer);
        }
    }
}