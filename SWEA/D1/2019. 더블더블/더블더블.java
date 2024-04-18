import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int s = 1;
        for (int i = 0; i <= N; i++) {
            if (i == 0){
                System.out.print(s + " ");
            }else {
                s *= 2;
                System.out.print(s + " ");
            }
        }
    }
}