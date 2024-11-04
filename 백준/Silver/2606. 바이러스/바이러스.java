import java.util.Scanner;

public class Main {
    static boolean graph[][];
    static boolean visited[];
    static int N, M;
    static int result;

    public static void dfs(int a){
        result++;
        visited[a] = true;
        for (int i = 1; i < N+1; i++) {
            if (!visited[i] && graph[a][i]){
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];

        int x,y;
        for (int i = 0; i < M; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            graph[x][y] = graph[y][x] = true;
        }
        dfs(1);
        System.out.println(result - 1);
    }
}