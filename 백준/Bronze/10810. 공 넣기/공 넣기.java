import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    int arr2[] = new int[N];
    int arr1[] = new int[M];
    for (int i = 0; i < arr1.length; i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        for (int k = a; k <= b; k++){
            arr2[k-1] = c;
        }
    }
        for (int total : arr2){
            System.out.print(total + " ");
        }
    }
}