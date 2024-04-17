import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int a = 0;
        while (true){
            if( N <1){
                break;
            }
            a = N % 10;
            N /= 10;
            sum += a;
        }
        System.out.println(sum);
    }
}