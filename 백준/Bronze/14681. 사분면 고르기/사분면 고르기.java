import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long A = in.nextLong();
    long B = in.nextLong();

    if (A >= 1 && B >= 1){
        System.out.println("1");
    } else if (A < 0 && B >= 1) {
        System.out.println("2");
    } else if (A < 0 && B < 0) {
        System.out.println("3");
        
    }
    else if (A >= 1 && B < 0){
        System.out.println("4");
    }
    }
}