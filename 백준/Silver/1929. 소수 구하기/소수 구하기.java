import java.util.Scanner;

public class Main {

    public static boolean [] b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int M = sc.nextInt();
        int N = sc.nextInt();
        b = new boolean[N + 1];
        che();
        for (int i = M; i <= N; i++) {
            if (!b[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);

    }
    public static void che(){
        b[0] = b[1] = true;

        for (int i = 2; i <Math.sqrt(b.length); i++) {
            if (b[i]) continue;
            for (int j = i * i; j < b.length; j += i) {
                b[j] = true;
            }
        }
    }
}