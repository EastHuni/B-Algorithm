import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static boolean [] visited;
    static int [] arr;
    static int [] answer;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N];
        arr = new int [N];
        answer = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0,0);
        System.out.println(sb);

    }
    public static void dfs(int idx, int depth){
        if(depth == M){
            for (int i = 0; i < M; i++) {
                sb.append(answer[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        int before = 0;
        for (int i = idx; i < N; i++) {

            if (!visited[i]) {
                if (before != arr[i]) {
                    visited[i] = true;
                    before = arr[i];
                    answer[depth] = arr[i];
                    dfs(i,depth + 1);
                    visited[i] = false;
                }
            }
        }
    }
}