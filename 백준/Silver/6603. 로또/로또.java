import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [] arr;
    static boolean [] visited;
    static int k;
    static StringBuilder sb = new StringBuilder();
    static int [] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if (k == 0){
                break;
            }
            arr = new int[k];
            visited = new boolean[k];
            result = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            dfs(0,0);
            sb.append('\n');
        }
        System.out.println(sb);
    }
    public static void dfs(int start, int depth){
        if (depth == 6){
            for (int i = 0; i < 6; i++) {
                sb.append(result[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = start; i < k; i++) {
            if (!visited[i]){
                visited[i] = true;
                result[depth] = arr[i];
                dfs(i,depth +1);
                visited[i] =false;
            }
        }
    }
}