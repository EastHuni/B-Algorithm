import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static boolean [] visited;
    static int [][] arr;
    static int answer;
    static int t;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N];
        answer = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (t = 1; t < N; t++) {
            dfs(0, 0);
        }

        System.out.println(answer);
    }
    public static void dfs(int idx, int depth){

        if(depth == t){
            answer = Math.min(answer, diff());
            if (answer == 0){
                System.out.println(answer);
                System.exit(0);
            }
            return;
        }

        for (int i = idx; i < N; i++) {
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