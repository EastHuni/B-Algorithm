import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int count =0;
        for (int i = 0; i < n ; i++){
            int a = sc.nextInt();
            arr[i] = a;
        }

        int b = sc.nextInt();
        for (int i = 0; i < n ; i++){
            if( arr[i] == b){
                count++;
            }

        }
        System.out.println(count);




    }
}