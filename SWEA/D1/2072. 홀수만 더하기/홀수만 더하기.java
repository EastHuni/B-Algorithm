import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a;
        for (int test_case = 1; test_case <= T; test_case++) {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
              a = sc.nextInt();
              if (a % 2 == 1){
                  sum += a;
              }
            }
            System.out.println("#" + test_case + " " + sum);
        }
    }
}