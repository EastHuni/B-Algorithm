import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int [] arr;
    static boolean [] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];
        arr = new int[N+1];
        dfs(1, 0);
        System.out.println(sb);
    }
    public static void dfs(int at, int depth){
        if (depth == M){
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
        }
        for (int i = at; i <= N; i++) {
            if (!visited[i]){
                visited[i] = true;
                arr[depth] = i;
                dfs(i+1, depth + 1 );
                visited[i] = false;
            }
        }

    }
}