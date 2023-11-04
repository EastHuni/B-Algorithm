import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[31];

        for (int i = 1 ; i < 29; i++){
            int success = sc.nextInt();
            arr[success] = 1;
        }
        for(int j = 1; j< arr.length; j++){
            if(arr[j] != 1){
                System.out.println(j);
            }
        }
    }
}