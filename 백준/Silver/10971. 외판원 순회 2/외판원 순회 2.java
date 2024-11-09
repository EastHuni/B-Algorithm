import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [][] graph;
    static boolean [] visited;
    static int N;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        graph = new int [N][N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            visited[i] = true;
            dfs(i,i,0, 0);
        }
        System.out.println(min);
    }
    public static void dfs(int start, int now, int result, int depth){
        if (depth == N -1){
            if (graph[now][start] != 0){
                result += graph[now][start];
                min = Math.min(result, min);
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i] && graph[now][i] > 0) {
                visited[i] = true;
                dfs(start,i,result + graph[now][i], depth+1);
                visited[i] = false;
            }
        }
    }

}