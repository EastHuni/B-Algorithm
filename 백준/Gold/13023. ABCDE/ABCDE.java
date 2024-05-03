import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static boolean [] visited;
    static ArrayList<Integer> A [];
    static int ans = 0;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        m = M;
        visited = new boolean[N];
        A = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            A[s].add(l);
            A[l].add(s);
        }
       for (int i = 0; i < N; i++) {
           if (ans == 0){
               DFS(i, 1);
           }
        }
        System.out.println(ans);
    }
    static void DFS(int v , int depth){
        if (depth == 5) {
            ans = 1;
            return;
        }
        visited[v] = true;
        for(int i : A[v]){
            int next = i;
            if (!visited[next]){
                DFS(next, depth+1);
            }
        }
        visited[v] = false;
    }
}