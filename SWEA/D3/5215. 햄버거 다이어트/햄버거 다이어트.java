import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int N, L, ans;
    static int[] score;
    static int[] cal;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_Case = 1; test_Case <= T; test_Case++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());
            score = new int[N];
            cal = new int[N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                score[i] = Integer.parseInt(st.nextToken());
                cal[i] = Integer.parseInt(st.nextToken());
            }
            ans = 0;
            dfs(0, 0, 0);
            System.out.println("#" + test_Case + " " + ans);

        }

    }

    static void dfs(int cnt, int sco, int kcal) {
        if (kcal > L) {
            return;
        }
        if (cnt == N) {
            ans = Math.max(ans, sco);
            return;
        }
        dfs(cnt + 1, sco + score[cnt], kcal + cal[cnt]);
        dfs(cnt + 1, sco, kcal);
    }
}