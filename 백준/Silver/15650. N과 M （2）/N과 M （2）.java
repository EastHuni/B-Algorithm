import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static boolean [] visited;
    static int [] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N+1];
        visited = new boolean[N+1];
        dfs(0,1);
        System.out.println(sb);
    }
    public static void dfs(int depth, int idx){
        if (depth == M){
            for (int i = 0; i < depth; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
        }
        for (int i = idx; i <= N; i++) {
            if (!visited[i]){
                visited[i] = true;
                arr[depth] = i;
                dfs(depth+1, i);
                visited[i] = false;
            }
        }
    }
}
