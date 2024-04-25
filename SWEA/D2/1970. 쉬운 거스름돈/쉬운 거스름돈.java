import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int [] arr = new int[8];
            if (N / 50000 != 0){
                arr[0] = N/50000;
                N %= 50000;
            }
            if (N / 10000 != 0) {
                arr[1] = N/10000;
                N %= 10000;
            }
            if (N / 5000 != 0) {
                arr[2] = N/5000;
                N %= 5000;
            }
            if (N / 1000 != 0) {
                arr[3] = N/1000;
                N %= 1000;
            }
            if (N / 500 != 0) {
                arr[4] = N/500;
                N %= 500;
            }
            if (N / 100 != 0) {
                arr[5] = N/100;
                N %= 100;
            }
            if (N / 50 != 0) {
                arr[6] = N / 50;
                N %= 50;
            }
            if (N /10 != 0){
                arr[7] = N /10;
                N %= 10;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(" ");
            }
            System.out.println("#" + test_case);
            System.out.println(sb);
        }
    }
}