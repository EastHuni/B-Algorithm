import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int [][] graph;
    static boolean [][] visited;
    static int startX, startY, endX, endY;
    static int ans;
    static int [] dx = {-1, 1, 0, 0};
    static int [] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 10;
        for (int test_case = 1; test_case <= T; test_case++) {
            ans  = 0;
            String s = br.readLine();
            graph = new int[100][100];
            visited = new boolean[100][100];
            for (int i = 0; i < 100; i++) {
                String str = br.readLine();
                for (int j = 0; j < 100; j++) {
                    graph[i][j] = str.charAt(j) - '0';
                    if (graph[i][j] == 2){
                        startX =i;
                        startY =j;

                    }
                    if (graph[i][j] == 3){
                        endX = i;
                        endY = j;
                    }
                }
            }
            dfs(startX,startY);
            System.out.println("#" + test_case + " " + ans);

        }
    }
    public static void dfs(int a, int b){
        if (graph[a][b]  == 3){
            ans = 1;
            return;
        }
        visited[a][b] = true;
        for (int i = 0; i < 4; i++) {
            int nx = a + dx[i];
            int ny = b + dy[i];
            if (nx >=0 && nx<100 && ny>=0 && ny<100 && !visited[nx][ny] && graph[nx][ny] != 1){
                dfs(nx, ny);
            }
        }
    }
}