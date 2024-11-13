import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int [][] graph;
    static boolean [][] visited;
    static int I;
    static int pointX, pointY;
    static int [] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int [] dy = {-2, -1, 1, 2, -2, -1, 1, 2};
    static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int a,b;
        for (int i = 0; i < T; i++) {
            I = Integer.parseInt(br.readLine());
            graph = new int[I][I];
            visited = new boolean[I][I];
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            q.add(new int[]{a,b});
            visited[a][b] = true;
            st = new StringTokenizer(br.readLine());
            pointX = Integer.parseInt(st.nextToken());
            pointY = Integer.parseInt(st.nextToken());
            bfs();
            System.out.println(graph[pointX][pointY]);
        }
    }
    public static void bfs(){
        while (!q.isEmpty()){
            int [] list = q.poll();
            int x = list[0];
            int y = list[1];
            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < I && ny >= 0 && ny < I && !visited[nx][ny]){
                    q.add(new int[]{nx, ny});
                    graph[nx][ny] = graph[x][y] + 1;
                    visited[nx][ny] = true;
                }
            }
        }
    }
}