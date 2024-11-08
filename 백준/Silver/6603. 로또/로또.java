import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int K;
    static boolean [] visited;
    static int [] arr;
    static int [] answer;
    public static void dfs(int idx, int depth){
        if (depth == 6){
            for (int i = 0; i < 6; i++) {
                System.out.print(answer[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = idx; i < K; i++) {
            if (!visited[i]){
                visited[i] = true;
                answer[depth] = arr[i];
                dfs(i, depth + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            K = Integer.parseInt(st.nextToken());
            if (K == 0) break;
            arr = new int[K];
            answer = new int[6];
            visited = new boolean[K];
            for (int i = 0; i < K; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            dfs(0, 0);
            System.out.println();
        }
    }
}