import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a,b;
        for (int test_case = 1; test_case <= T; test_case++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("#" + test_case + " " + (a/b) + " " + (a%b));
        }
    }
}