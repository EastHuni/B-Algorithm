import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
        for (int i = 1; i <= N; i++) {
            String s = sc.next();
            String year = s.substring(0, 4);
            String month = s.substring(4, 6);
            String day = s.substring(6, 8);
            if ((Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= days[Integer.parseInt(month)])){
                System.out.println("#" + i + " " + year + "/" + month + "/" + day );
            }else System.out.println("#" + i + " " +"-1");
        }
    }
}