import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [][] graph;
    static int [] dx = {-1, 1, 0, 0}; //상,하
    static int [] dy = {0, 0, -1, 1}; //좌,우
    static boolean [][] visited;
    static int N, M;
    static int max = Integer.MIN_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = true;
                dfs(i, j, graph[i][j], 1);
                visited[i][j] = false;
            }
        }
        System.out.println(max);
    }
    public static void dfs(int row, int col, int sum, int count){
        if(count == 4){
            max = Math.max(max, sum);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int curRow = row + dx[i];
            int curCol = col + dy[i];

            if (curRow < 0 || curRow>=N || curCol < 0 || curCol>=M){
                continue;
            }
            if (!visited[curRow][curCol]){

                if(count == 2){
                    visited[curRow][curCol] = true;
                    dfs(row, col, sum + graph[curRow][curCol], count +1);
                    visited[curRow][curCol] = false;
                }

                visited[curRow][curCol] = true;
                dfs(curRow, curCol, sum + graph[curRow][curCol], count +1);
                visited[curRow][curCol] = false;

            }
        }
    }
}