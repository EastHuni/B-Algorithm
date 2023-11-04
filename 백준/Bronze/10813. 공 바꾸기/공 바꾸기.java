import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    int arr[] = new int[N];

    for (int j = 0; j< arr.length ; j++){
        arr[j] = j + 1;
    }
    int temp = 0;
    for (int i = 0; i < M; i++){
        int a = sc.nextInt();
        int b = sc.nextInt();

        temp = arr[b-1];
        arr[b-1] = arr[a-1];
        arr[a-1] = temp;

    }

    for (int k : arr){
        System.out.print(k + " ");
        }
    }
}