import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        int MaxCandies = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j< n -1){
                    swap(arr, i, j, i,j+1);
                    MaxCandies = Math.max(MaxCandies, maxCandy(arr, n));
                    swap(arr, i ,j, i, j+1);
                }

                if (i< n -1){
                    swap(arr, i, j, i+1,j);
                    MaxCandies = Math.max(MaxCandies, maxCandy(arr, n));
                    swap(arr, i ,j, i+1, j);
                }

            }
        }
        System.out.println(MaxCandies);
    }
    private static void swap(char[][] arr, int x1, int y1, int x2, int y2){
        char temp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = temp;
    }

    private static int maxCandy(char[][] arr, int n){
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int countRow = 1;
            int countCol = 1;
            for (int j = 1; j < n; j++) {
                if(arr[i][j] == arr[i][j-1]){
                    countRow++;
                }else{
                    maxLen = Math.max(maxLen, countRow);
                    countRow = 1;
                }

                if(arr[j][i] == arr[j-1][i]){
                    countCol++;
                }else{
                    maxLen = Math.max(maxLen, countCol);
                    countCol = 1;
                }
            }
            maxLen = Math.max(maxLen, countRow);
            maxLen = Math.max(maxLen, countCol);
        }
        return  maxLen;
    }
}