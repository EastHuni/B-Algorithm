import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // 가위 : 1 , 바위 : 2 , 보 : 3
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 1){
            if (b == 2){
                System.out.println("B");
            } else if (b == 3) {
                System.out.println("A");

            }
        } else if (a == 2) {
            if (b == 1){
                System.out.println("A");
            } else if (b == 3) {
                System.out.println("B");
            }

        } else if (a == 3) {
            if (b == 1){
                System.out.println("B");
            } else if (b == 2) {
                System.out.println("A");
            }

        }
    }
}