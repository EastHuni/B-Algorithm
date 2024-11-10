import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static boolean [] visited;
    static ArrayList<Integer> [] arr;
    static int N, M;
    static int answer = 0;;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new ArrayList[N+1];
        visited = new boolean[N+1];
        for (int i = 1; i < N+1; i++) {
            arr[i] = new ArrayList<Integer>();
        }
        int a,b;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]){
                dfs(i);
                answer++;
            }
        }
        System.out.println(answer);
    }
    public static void dfs(int start){
        visited[start] = true;
        for(int i : arr[start]){
            if (!visited[i]){
                dfs(i);
            }
        }
    }
}