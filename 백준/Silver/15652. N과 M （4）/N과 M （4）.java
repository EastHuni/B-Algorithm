import java.util.Scanner;

public class Main {
    static int N, M;
    static int [] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int [M];
        dfs(1,0);
        System.out.println(sb);
    }
    public static void dfs(int index, int depth){
        if(depth == M){
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = index; i <= N; i++) {
            arr[depth] = i;
            dfs(index++, depth + 1);
        }

    }
}