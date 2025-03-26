import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static boolean [] visited;
    static ArrayList <Integer> [] arr;
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new ArrayList[N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new ArrayList<Integer>();
        }
        int a, b;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            a =  Integer.parseInt(st.nextToken());
            b =  Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        for (int i = 0; i < N; i++) {
            if (ans == 0) {
                dfs(i, 1);
            }
        }
        System.out.println(ans);
    }
    public static void dfs(int v, int depth){
        if(depth == 5){
            ans = 1;
            return;
        }
        visited[v] = true;
        for(int i: arr[v]){
            if (!visited[i]){
                dfs(i,depth + 1);
            }
        }
        visited[v] =false;
    }
}