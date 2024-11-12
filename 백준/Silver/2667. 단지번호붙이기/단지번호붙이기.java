import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int [][] graph;
    static boolean [][] visited;
    static int [] dx = {-1, 1, 0, 0};  //상 하
    static int [] dy = {0, 0, -1, 1}; // 좌 우
    static int N, cnt;
    static List<Integer> result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        visited = new boolean[N][N];
        result = new LinkedList<>();
        cnt = 1;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
             if (graph[i][j]==1 && !visited[i][j]){
                 dfs(i, j);
                 result.add(cnt);
                 cnt = 1;
             }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(int r: result){
            System.out.println(r);
        }
    }
    public static void dfs(int a, int b){
        visited[a][b] = true;
        for (int i = 0; i < 4; i++) {
            int x = a + dx[i];
            int y = b + dy[i];
            if (x >= 0 && x<N && y>= 0 && y<N && !visited[x][y] && graph[x][y] == 1){
                cnt++;
                dfs(x,y);
            }
        }

    }
}