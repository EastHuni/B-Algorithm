import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for(int j = 1; j <= a-i; j++) {
                System.out.printf(" ");
            }
            for(int k = 1; k <= 2*i -1;  k++){

                System.out.printf("*");
            }
            System.out.println();
        }

        for (int i = a-1; i >= 1; i--){
            for(int j = 1; j<= a-i; j++){
                System.out.printf(" ");
            }
            for(int k = 1 ; k <= 2* i -1; k++){
                System.out.printf("*");
            }
            System.out.println();

        }
    }

}