import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N =sc.nextInt();
            int M =sc.nextInt();
            int [] arr = new int[N];
            int [] arr1 = new int [M];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < M; i++) {
                arr1[i] = sc.nextInt();
            }
            if (N > M){
                int temp = N; N = M; M = temp;
                int [] tempArr = arr; arr = arr1; arr1 =tempArr;
            }

            int max = 0;
            for (int i = 0; i < M-N+1; i++) {
                int result = 0;
                for (int j = 0; j < N; j++) {
                    result += arr[j] * arr1[i+j];
                }
                if (max < result){
                    max = result;
                }
            }
            System.out.println("#" + test_case + " " + max);
        }
    }
}