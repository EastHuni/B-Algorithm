import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int [][] arr = new int[10][10];
            boolean result = true;
            
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            //행 검사  + 열 검사
            for (int i = 0; i < 9; i++) {
                int [] row = new int[10];
                for (int j = 0; j < 9; j++) {
                    row[arr[i][j]]++;
                }
                for (int k = 1; k <= 9; k++) {
                    if (row[k] == 0){
                        result = false;
                        break;
                    }
                }
            }

            for (int i = 0; i < 9; i++) {
                int [] row = new int[10];
                for (int j = 0; j < 9; j++) {
                    row[arr[j][i]]++;
                }
                for (int k = 1; k <= 9; k++) {
                    if (row[k] == 0){
                        result = false;
                        break;
                    }

                }
            }



            // 수도쿠 3 x 3 칸 검사  0, 3, 6
            for (int i = 0; i <= 6; i+=3) {
                for (int j = 0; j <= 6; j+=3) {
                    int [] row = new int[10];
                    int a = i+3;
                    int b = j+3;

                    for (int k = i; k < a; k++) {
                        for (int l = j; l < b; l++) {
                            row[arr[k][l]]++;
                        }
                    }
                    for (int k = 1; k <= 9; k++) {
                        if (row[k] == 0){
                            result = false;
                            break;
                        }
                    }
                }
            }
            int answer = result ? 1 : 0;

            System.out.println("#" + test_case + " " + answer);

        }
    }
}