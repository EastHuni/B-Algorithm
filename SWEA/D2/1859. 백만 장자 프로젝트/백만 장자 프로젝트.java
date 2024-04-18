import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int a = sc.nextInt();
            int [] arr = new int[a];
            for (int j = 0; j < a; j++) {
                arr[j] = sc.nextInt();
            }
            long max = Long.MIN_VALUE;
            long sum = 0;
            for (int j = arr.length - 1; j >= 0 ; j--) {
            if (arr[j] > max){
                max = arr[j];
            }
            if (arr [j] < max){
                sum += max - arr[j];
            }
            }
            System.out.println("#" + i + " " + sum);
        }

    }
}