import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static Queue<int[]> q = new LinkedList<>();
    static boolean [][] visited;
    static int [][] graph;
    static int M,N, count;
    static int [] dx = {-1, 1, 0, 0};
    static int [] dy = {0, 0, -1, 1};
    // BFS 로 풀 것
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if (graph[i][j] == 1){
                    q.add(new int[] {i, j});
                }
            }
        }
        System.out.println(bfs());
    }
    public static int bfs(){
        while (!q.isEmpty()){
            int [] list = q.poll();
            int x = list[0];
            int y = list[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx <N && ny >= 0 && ny< M && !visited[nx][ny] &&
                        graph[nx][ny] == 0){
                    q.add(new int[] {nx,ny});
                    graph[nx][ny] = graph[x][y] + 1;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (graph[i][j] == 0){
                    return -1;
                }
                count = Math.max(count, graph[i][j]);
            }
        }
        if (count == 1){
            return 0;
        } else{
            return count -1;
        }
    }
}