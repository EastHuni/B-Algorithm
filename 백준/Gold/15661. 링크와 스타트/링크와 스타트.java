import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [][] arr;
    static boolean [] visited;
    static int N;
    static int min = Integer.MAX_VALUE;
    static int t;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1][N+1];
        visited = new boolean[N+1];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (t = 1; t < N; t++) {
            dfs(0, 0);
        }
        System.out.println(min);
    }
    public static void dfs(int start, int depth){
        if(depth == t){
            min = Math.min(min, diff());
            if (min == 0){
                System.out.println(min);
                System.exit(0);
            }
            return;
        }
        for (int i = start; i < N; i++) {
            if (!visited[i]){
                visited[i] = true;
                dfs(i+1, depth+1);
                visited[i] = false;
            }
        }
    }
    public static int diff(){
        int team_start =0;
        int team_link = 0;
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (visited[i] && visited[j]){
                    team_start += arr[i][j] + arr[j][i];

                }
                else if (!visited[i] && !visited[j]){
                    team_link += (arr[i][j] + arr[j][i]);

                }
            }
        }
        return Math.abs(team_start - team_link);
    }
}