import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.StringTokenizer;

public class Main {
    static boolean [] visited;
    static int [] arr;
    static int [] answer;
    static int N;
    static int result;
    public static void dfs( int depth){
        if(depth == N){
            int sum = 0;
            for (int i = 0; i < N-1; i++) {
                sum += Math.abs(answer[i] - answer[i+1]);
            }
            result = Math.max(result, sum);
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]){
                visited[i] = true;
                answer[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        answer = new int[N];
        visited = new boolean[N];
        StringTokenizer st= new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] =Integer.parseInt(st.nextToken());
        }
        dfs(0);
        System.out.println(result);
    }
}