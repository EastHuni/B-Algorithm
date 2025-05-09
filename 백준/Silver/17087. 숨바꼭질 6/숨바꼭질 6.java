import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Math.abs(Integer.parseInt(st.nextToken()) - S);
        }
        int gcd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            gcd = GCD(gcd, arr[i]);
        }
        System.out.println(gcd);
    }
    public static int GCD(int a, int b){
        if (b == 0) return a;
        return GCD(b, a % b);
    }
}