import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            if (M == 0 && N ==0){
                break;
            }

            else if ( (M % N)  == 0){
                System.out.println("factor");
            }
            else if( (N % M) == 0){
                System.out.println("multiple");
            }
            else {
                System.out.println("neither");
            }

        }

    }
}