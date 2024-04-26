import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int [][] arr = new int[N][N];
            //우 하 좌 상 이동
            // 0 1 0 -1
            // 1 0 -1 0
            int [] di = {0, 1, 0, -1};
            int [] dj = {1, 0, -1, 0};
            int i = 0;
            int j = 0;
            int dr = 0;
            int count = 1;
            arr[i][j] = count;
            count += 1;
            while (count <= N * N){
                int si = i + di[dr];
                int sj = j + dj[dr];
                if ((0<= si) && (si < N) && (0<= sj)&& (sj <N) && (arr[si][sj] == 0)){
                    i = si;
                    j = sj;
                    arr[si][sj] = count;
                    count += 1;
                }else dr = (dr+1) % 4;
            }
            StringBuilder sb = new StringBuilder();
            System.out.println("#" + test_case);
            for (int k = 0; k < N; k++) {
                for (int l = 0; l < N; l++) {
                    sb.append(arr[k][l]).append(" ");
                }
                sb.append("\n");
            }
            System.out.print(sb);

        }
    }
}