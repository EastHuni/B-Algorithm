import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        int count =0;
        for (int i = 0; i < n ; i++){
            int a = sc.nextInt();
            if (a < m){
                System.out.printf(a + " ");

            }
        }





    }
}