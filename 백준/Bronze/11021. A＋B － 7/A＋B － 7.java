import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[i] = a + b;


        }
        for( int j = 0 ; j < n ; j++){
            int k = j + 1;
            System.out.println("Case #"+ k + ": " + arr[j] );


        }


    }





    }