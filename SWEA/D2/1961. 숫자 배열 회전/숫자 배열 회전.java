import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N =sc.nextInt();
            int [][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int [][] arr_90 = rotation(arr);
            int [][] arr_180 = rotation(arr_90);
            int [][] arr_270 = rotation(arr_180);

            System.out.println("#" + test_case);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr_90[i][j]);
                }
                System.out.print(" ");
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr_180[i][j]);
                }
                System.out.print(" ");
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr_270[i][j]);
                }
                System.out.println();
            }

        }
    }

    public static int[][] rotation(int [][] arr){
        int [][] result = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                result[i][j] = arr[arr.length-1-j][i];
            }
        }
        return result;
    }
}