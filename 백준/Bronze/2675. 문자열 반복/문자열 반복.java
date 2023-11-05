import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        for (int i = 0; i < S; i++) {
            int n = sc.nextInt();
            String str = sc.next();
            for(int j = 0; j < str.length(); j++){
                for(int k = 0; k < n; k++){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}