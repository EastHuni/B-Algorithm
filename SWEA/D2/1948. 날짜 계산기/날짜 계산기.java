import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int [] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int test_case = 1; test_case <= T; test_case++) {
            int first_month = sc.nextInt();
            int day = sc.nextInt();
            int last_month = sc.nextInt();
            int day2 = sc.nextInt();

            day2 -= day;
            day2++;

            for (int i = first_month; i < last_month ; i++) {
                day2 += months[i];
            }
            System.out.println("#" + test_case + " " + day2);
        }
    }
}