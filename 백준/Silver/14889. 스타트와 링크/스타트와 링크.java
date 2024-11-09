import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [][] arr;
    static boolean [] visited;
    static int N;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1][N+1];
        visited = new boolean[N+1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(1, 0);
        System.out.println(min);
    }
    public static void dfs(int x, int depth){
        if (depth == N/2){
            diff();
            return;
        }
        for (int i = x; i <= N; i++) {
            if (!visited[i]){
                visited[i] = true;
                dfs(i+1, depth + 1);
                visited[i] = false;
            }
        }
    }
    public static void diff() {
        int team_start = 0;
        int team_link = 0;

        for (int i = 1; i < N; i++) {
            for (int j = i+1; j < N+1; j++) {
                if (visited[i] && visited[j]){
                    team_start += arr[i][j];
                    team_start += arr[j][i];
                }
                else if (!visited[i] && !visited[j]){
                    team_link += arr[i][j];
                    team_link += arr[j][i];
                }
             }
        }
        int result = Math.abs(team_start - team_link);
        if (result == 0){
            System.out.println(result);
            System.exit(0);
        }
        min = Math.min(min, result);

    }
}