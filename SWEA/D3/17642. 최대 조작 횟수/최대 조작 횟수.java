import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <=T; test_case++) {
            long  answer = -1;
            long A = sc.nextLong();
            long B = sc.nextLong();
            long result = B - A;
            if (result > 1) answer = result/ 2;
            if (result == 0) answer = 0;
            System.out.println("#" +  test_case + " " + answer);
        }
    }
}