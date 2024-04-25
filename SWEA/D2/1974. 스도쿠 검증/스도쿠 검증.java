import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int testCase = 1; testCase <= T; testCase++) {
            int[][] sudoku = new int[10][10];
            boolean check = true;

            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine(), " ");

                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < 9; i++) {
                int[] arr = new int[10];

                for (int j = 0; j < 9; j++)
                    arr[sudoku[i][j]]++;

                for (int k = 1; k <= 9; k++) {
                    if (arr[k] == 0) {
                        check = false;
                        break;
                    }
                }
            }

            for (int i = 0; i < 9; i++) {
                int[] arr = new int[10];

                for (int j = 0; j < 9; j++)
                    arr[sudoku[j][i]]++;

                for (int k = 1; k <= 9; k++) {
                    if (arr[k] == 0) {
                        check = false;
                        break;
                    }
                }
            }

            for (int i = 0; i <= 6; i += 3) {
                for (int j = 0; j <= 6; j += 3) {
                    int[] arr = new int[10];

                    int a = i + 3;
                    int b = j + 3;

                    for (int x = i; x < a; x++) {
                        for (int y = j; y < b; y++) {
                            arr[sudoku[x][y]]++;
                        }
                    }

                    for (int z = 1; z <= 9; z++) {
                        if (arr[z] == 0) {
                            check = false;
                            break;
                        }
                    }
                }
            }

            int result = check ? 1 : 0;

            System.out.println("#" + testCase + " " + result);
        }
    }
}