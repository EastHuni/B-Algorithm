import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        int Fn = a1 * n0 + a0;
        int Gn = c * n0;

        if (Fn <= Gn && c>=a1){
            System.out.println(1);
        }
        else
            System.out.println(0);

    }
}