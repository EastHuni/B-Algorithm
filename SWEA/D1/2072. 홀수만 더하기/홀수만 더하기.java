import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                int a = sc.nextInt();
                if (a % 2 == 1){
                    sum += a;
                }
            }
            System.out.println("#" + (i+1) + " " + sum);
        }

    }
}