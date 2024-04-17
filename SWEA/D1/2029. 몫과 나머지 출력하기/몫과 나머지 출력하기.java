import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int average = 0;
            int result = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            average = a / b;
            result = a % b;
            System.out.println("#" + i + " " + average + " " + result);
        }

    }
}