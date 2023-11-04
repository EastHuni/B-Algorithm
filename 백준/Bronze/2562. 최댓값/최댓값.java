import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];

        int max = arr[0];
        int s = 0;
        for (int i = 0 ; i < arr.length ; i++){
            int a = sc.nextInt();
            arr[i] = a;
        }

        for(int j = 0; j < arr.length; j++){
            if(max < arr[j]){
                max = arr[j];
                 s = j + 1;

            }

        }
        System.out.println(max);
        System.out.println(s);
    }
}