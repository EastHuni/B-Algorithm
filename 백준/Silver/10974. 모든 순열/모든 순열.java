import java.util.Scanner;

public class Main {
    static int [] arr;
    static boolean [] visited;
    static int N;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N+1];
        visited = new boolean[N+1];
        dfs(0);
        System.out.println(sb);
    }
    public static void dfs(int depth){
        if(depth == N){
            for (int i = 0; i < N; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (!visited[i]){
                visited[i] = true;
                arr[depth] = i;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}
