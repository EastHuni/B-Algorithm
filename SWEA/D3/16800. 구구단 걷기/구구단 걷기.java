import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            long N = Long.parseLong(br.readLine());
            long B = 0;
            long A = 0;
            for (long i = 1; i <= (long)Math.sqrt(N); i++) {
                if (N % i == 0){
                    A = i;
                    B = N/i;
                }
            }
            System.out.println("#" + test_case + " " + (A+B-2));
        }
    }
}