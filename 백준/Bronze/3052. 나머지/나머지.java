import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int count = 0;
        boolean bl;
        for (int i = 0 ; i < arr.length; i++){
            int a = sc.nextInt();
            arr[i] = a % 42;
        }

        for(int j = 0; j< arr.length; j++){
            bl = false;
            for(int k = j + 1; k<arr.length; k++){
                if (arr[j] == arr[k]){
                    bl = true;
                    break;
                }

            }
            if (bl == false){
                count++;
            }
        }

        System.out.println(count);

    }
}