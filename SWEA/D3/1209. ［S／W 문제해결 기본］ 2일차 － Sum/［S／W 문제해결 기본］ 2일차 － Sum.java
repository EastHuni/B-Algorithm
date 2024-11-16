import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int test_case = 1; test_case <= 10; test_case++) {
            int T = Integer.parseInt(br.readLine());
            int [][] arr = new int[100][100];
            int [] rowresult = new int[100];
            int [] colresult = new int[100];
            for (int i = 0; i < 100; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    rowresult[i] += arr[i][j];
                    colresult[i] += arr[j][i];
                }
            }
            Arrays.sort(rowresult);
            int clossR = 0;
            int clossL= 0;
            for (int i = 0; i < 100; i++) {
                clossR +=  arr[i][i];
                clossL += arr[i][99-i];
            }
            int max = 0;
            Arrays.sort(rowresult);
            Arrays.sort(colresult);
            max = Math.max(rowresult[99], colresult[99]);
            max = Math.max(max, clossR);
            max = Math.max(max, clossL);
            System.out.println("#" + test_case+ " " + max);

        }
    }
}