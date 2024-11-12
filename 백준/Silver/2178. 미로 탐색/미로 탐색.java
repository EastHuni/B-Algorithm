import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean [][] visited;
    static int [][] graph;
    static int N,M;
    static int [] dx = {-1, 1, 0, 0};
    static int [] dy = {0, 0, -1, 1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N+1][M+1];
        visited = new boolean[N+1][M+1];

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++) {
                graph[i][j] = str.charAt(j-1) - '0';
            }
        }

        System.out.println(bfs(1, 1));
    }
    public static int bfs(int a, int b){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{a, b});
        visited[a][b] = true;

        while (!q.isEmpty()){
            int [] current = q.poll();
            int x = current[0];
            int y = current[1];

            if (x == N && y == M) {
                return graph[x][y];
            }
            for (int i = 0; i < 4; i++) {
                int nx = x +dx[i];
                int ny = y +dy[i];
                if (nx >= 1 && nx <= N && ny >= 1 && ny <= M && !visited[nx][ny] && graph[nx][ny] != 0){
                    visited[nx][ny] = true;
                    graph[nx][ny] = graph[x][y] + 1;
                    q.add(new int[]{nx,ny});
                }
            }

        }
        return -1;

    }
}