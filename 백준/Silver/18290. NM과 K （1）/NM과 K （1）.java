import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [][] graph;
    static boolean [][] visited;
    static int N, M, K, startX, startY;
    static int MAX = Integer.MIN_VALUE;
    static int [] dx = {-1, 1, 0, 0};
    static int [] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0,0,0,0);
        System.out.println(MAX);


    }
    public static void dfs(int a, int b, int sum, int depth) {
        if (depth == K) {
            MAX = Math.max(MAX, sum);
            return;
        }
        for (int i = a; i < N; i++) {
            for (int j = b; j < M; j++) {
                if (!visited[i][j]){
                    if (diff(i,j)){
                        visited[i][j] = true;
                        dfs(a, b, sum+ graph[i][j], depth +1);
                        visited[i][j] = false;
                    }
                }
            }
        }
    }
    public static boolean diff(int x, int y){
        boolean flag = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx>= 0 && nx <N && ny>=0 && ny<M){
                if (visited[nx][ny]) {
                    flag =  false;
                }
            }
        }
        return flag;
    }
}