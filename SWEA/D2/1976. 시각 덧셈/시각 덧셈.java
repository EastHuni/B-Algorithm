import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T ; test_case++) {
            int hour = sc.nextInt();
            int min = sc.nextInt();
            hour += sc.nextInt();
            min += sc.nextInt();
            if (min >= 60){
                hour += 1;
                min -= 60;
            }
            if (hour > 12){
                hour -= 12;
            }
            System.out.println("#" + test_case + " " + hour + " " + min);
        }
    }
}