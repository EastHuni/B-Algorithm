import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static int N, count;
    static int [][] arr;
    static boolean [][] visited;
    static int [] dx = {-1, 1, 0 ,0};
    static int [] dy = {0, 0, -1, 1};
    static LinkedList <Integer> result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int [N][N];
        visited = new boolean[N][N];
        result = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        count = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j] && arr[i][j] == 1){
                    dfs(i, j);
                    result.add(count);
                    count = 1;
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(int i: result){
            System.out.println(i);
        }
    }
    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx>=0 && nx<N && ny>= 0 && ny <N){
                if (!visited[nx][ny] && arr[nx][ny] == 1){
                    count++;
                    dfs(nx, ny);
                }
            }
        }
    }
}