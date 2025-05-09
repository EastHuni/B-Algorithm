import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int [] arr;
    static int [] result;
    static boolean [] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        result = new int[M];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0,0);
        System.out.println(sb);
    }
    public static void dfs(int start, int depth){
        if (depth == M){
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        int begin = 0;
        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                if (begin != arr[i]) {
                    visited[i] = true;
                    begin = arr[i];
                    result[depth] = arr[i];
                    dfs(i,depth + 1);
                    visited[i] = false;
                }
            }
        }
    }

}