import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int A = in.nextInt();
    int B = in.nextInt();

    if (A > B) {
            System.out.println(">");
        }
    if(A < B){
        System.out.println("<");
        
    }
    if(A==B){
        System.out.println("==");
    }
    }
}