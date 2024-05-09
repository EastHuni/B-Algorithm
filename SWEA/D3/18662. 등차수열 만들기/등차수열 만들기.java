import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextInt();

            if (2*b == a + c){
                System.out.println("#" + test_case + " " +"0.0");
            } else if (2*b > a + c) {
                double result =(2 * b - (a + c)) / 2;
                System.out.println("#" + test_case + " " + result);
            }else {
                double result = ((a+c) - (2*b)) / 2;
                System.out.println("#" + test_case + " " + result);
            }
        }
    }
}