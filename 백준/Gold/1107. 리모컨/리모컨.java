import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean [] button = new boolean[10];
        Arrays.fill(button, false);
        for (int i = 0; i < M; i++) {
            button[sc.nextInt()] = true;
        }
        int result = Math.abs(N - 100);
        for (int i = 0; i <= 999999; i++) {
            String num = String.valueOf(i);

            boolean isBreak = false;
            for (int j = 0; j < num.length(); j++) {
                if(button[num.charAt(j) - '0']){
                    isBreak = true;
                    break;
                }
            }
            if(!isBreak){
                int min = Math.abs(N - i) + num.length();
                result = Math.min(min, result);
            }
        }
        System.out.println(result);



    }
}