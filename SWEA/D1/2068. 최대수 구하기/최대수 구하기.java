import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int MAX = 0;
            for (int j = 0; j < 10; j++) {
                int a = sc.nextInt();
                if (MAX < a){
                    MAX = a;
                }
            }
            System.out.println("#" + i + " " + MAX);
        }
    }
}