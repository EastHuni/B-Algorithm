import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double arr[] = new double[N];
        double max = 0;
        max = arr[0];
        for (int i = 0 ; i < N; i++){
            int a = sc.nextInt();
            arr[i] = a;

            if(max < arr[i]) {
                max = arr[i];

            }

        }
        double sum = 0;
        for (int i =0; i< N; i++){
            sum += ((arr[i] / max) * 100);
        }

        System.out.println(sum / N);



    }
}