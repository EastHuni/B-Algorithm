import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int w, h, count;
    static boolean [][] visited;
    static int [][] graph;
    static int [] dx = {-1, -1, 1, 1, -1, 1, 0 ,0};
    static int [] dy = {-1, 1, -1, 1, 0, 0, -1 ,1};
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0){
                break;
            }
            visited = new boolean[h][w];
            graph = new int[h][w];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && graph[i][j] == 1) {
                        dfs(i, j);
                        count += 1;
                    }
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
    public static void dfs(int x, int y){
        visited[x][y] = true;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx>= 0 && nx < h && ny>=0 && ny<w){
                if(!visited[nx][ny] && graph[nx][ny] == 1){
                    dfs(nx, ny);
                }
            }
        }
    }
}