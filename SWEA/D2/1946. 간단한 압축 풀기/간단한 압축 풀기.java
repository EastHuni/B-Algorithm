import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            String [] str = new String[N];
            int [] arr = new int[N];
            for (int i = 0; i < N; i++) {
                str[i] = sc.next();
                arr[i] = sc.nextInt();
            }
            System.out.println("#" + test_case);
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < arr[i]; j++) {
                    System.out.print(str[i]);
                    cnt++;
                    if (cnt == 10){
                        System.out.println(" ");
                        cnt = 0;
                    }
                }
            }
            System.out.println();
        }
    }
}