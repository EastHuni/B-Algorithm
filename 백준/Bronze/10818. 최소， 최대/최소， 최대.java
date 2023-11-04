import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n ; i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        int min = arr[0];
        for (int k = 0; k < n; k++) {
            if (min > arr[k]) {
                min = arr[k];
            }
        }
        
        int max = arr[0];
            for (int j = 0; j < n; j++){
                if (arr[j] > max){
                    max = arr[j];
                }

            }

        System.out.print(min + " " + max);
    }
}