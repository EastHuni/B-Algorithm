import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long A = in.nextLong();
    long B = in.nextLong();
    long C = A * 60 + B;
    long D = C - 45;

    if (D < 0){
        A = 23;
        B = 60 + D;
        System.out.print(A + " ");
        System.out.print(B);
    }
    else if (D == 0){
        System.out.println("0 0");
    }
    else {
        A = D / 60;
        B = D % 60;
        System.out.print(A + " ");
        System.out.print(B);
    }

    }
}