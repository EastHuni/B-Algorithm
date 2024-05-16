import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int min = Math.min(a, b);
            if (N >= a + b){
                System.out.println("#" + test_case + " " +  min + " " + 0);
            }else {
                System.out.println("#" + test_case + " " + min +  " " + ((a+b) - N) );
            }
        }
    }
}