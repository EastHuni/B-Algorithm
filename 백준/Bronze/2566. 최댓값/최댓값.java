import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();

            }

        }
        int max = 0;
        int maxi = 0;
        int maxj = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                    maxi = i ;
                    maxj = j;
                }

            }
        }
        System.out.println(max + " ");
        System.out.printf((maxi+1) + " ");
        System.out.printf((maxj+1) + " ");
    }
}