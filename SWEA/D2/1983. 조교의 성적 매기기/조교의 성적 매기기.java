import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        String [] str = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        for (int test_case = 1; test_case <=T ; test_case++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            Double [] arr = new Double[N];
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                arr[i] = 0.35*a + 0.45*b + 0.2*c;
            }
            double goal = arr[K-1];
            Arrays.sort(arr,Collections.reverseOrder());
            for (int i = 0; i < N; i++) {
                if (arr[i] == goal){
                    System.out.println("#" + test_case + " " + str[i/(N/10)]);
                    break;
                }
            }
        }

    }
}