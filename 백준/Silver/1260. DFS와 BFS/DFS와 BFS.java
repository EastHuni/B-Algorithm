import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, V;
    static boolean [] visited;
    static boolean [][] arr;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        arr = new boolean[N+1][N+1];
        visited = new boolean[N+1];
        int a, b;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = true;
        }
        dfs(V);
        sb.append("\n");
        visited = new boolean[N+1];
        bfs(V);
        System.out.println(sb);
    }
    public static void dfs(int start){
        visited[start] = true;
        sb.append(start).append(" ");
        for (int i = 1; i < N+1; i++) {
            if (!visited[i] && arr[start][i]){
                dfs(i);
            }
        }
    }
    public static void bfs(int start){
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()){
            start = q.poll();
            sb.append(start).append(" ");

            for (int i = 1; i < N+1; i++) {
                if (arr[start][i] && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}