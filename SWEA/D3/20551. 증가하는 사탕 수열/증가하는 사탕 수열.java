import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (b <= 1 || c <= 2){
                System.out.println("#" + test_case + " " + "-1");
                continue;
            }
            int count = 0;
            if (b >= c){
                count += b - c + 1;
                b = c - 1;
            }
            if (a >= b){
                count += a - b + 1;
            }
            System.out.println("#" + test_case + " " + count);
        }
    }
}