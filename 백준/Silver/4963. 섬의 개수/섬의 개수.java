import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static boolean [][] visited;
    static int [][] graph;
    static int w, h;
    static StringBuilder sb = new StringBuilder();
    static int [] dx = { 0, 0, -1, 1, -1, 1, -1, 1};
    static int [] dy = {-1, 1, 0, 0, -1, -1, 1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0){
                break;
            }
            graph = new int[h][w];
            visited = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int cnt = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && graph[i][j] == 1) {
                        cnt++;
                        dfs(i, j);
                    }
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);

    }
    public static void dfs(int a, int b){
        visited[a][b] = true;
        for (int i = 0; i < 8; i++) {
            int x = a + dx[i];
            int y = b + dy[i];
            if (x >= 0 && x<h && y>=0 && y <w && !visited[x][y] && graph[x][y] == 1){
                dfs(x,y);
            }
        }
    }
}