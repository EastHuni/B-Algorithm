import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];

        for (int j = 0 ; j < N  ; j++){
            arr[j] = j + 1;
        }
        for (int i = 0 ; i < M ; i++) {
            int left = sc.nextInt() - 1;
            int right = sc.nextInt() - 1;
            while( left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
            }
        for(int deserve:arr){
            System.out.print(deserve + " ");
        }
        }


    }