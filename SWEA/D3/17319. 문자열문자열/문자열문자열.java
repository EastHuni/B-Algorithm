import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine());
            String str = br.readLine();
            if (N % 2 != 0){
                System.out.println("#" + test_case + " No");
                continue;
            }
            int len = N/2;
            boolean check = true;
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) != str.charAt(len + i)){
                    check = false;
                    break;
                }
            }
            if (check) System.out.println("#" + test_case + " Yes");
            else System.out.println("#" + test_case + " No");
        }
    }
}