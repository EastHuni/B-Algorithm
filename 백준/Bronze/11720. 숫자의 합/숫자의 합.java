import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String y = sc.next();
        int result = 0;

        for(int i=0; i<n; i++){
            result += Integer.parseInt(y.substring(i, i+1));
        }

        System.out.println(result);
    }
}