import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        for (int i = 0; i < N; i++) {
            double sum = 0.0;
            for (int j = 0; j < 10; j++) {
                sum += sc.nextInt();
            }
            System.out.print("#" + (i+1) + " ");
            System.out.printf("%.0f", sum/10);
            System.out.println("");
        }

    }
}