import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ab = bcd(a,b);
            System.out.println(((a * b) / bcd(a,b)));

        }
    }
    public static int bcd(int num1,int num2){
        if (num1 % num2 == 0) return num2;
        else return bcd(num2, num1 % num2);
    }

}