import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            long [] result = new long[N];
            long [] arr = new long[N*2];
            boolean [] visited = new boolean[N*2];
            for (int i = 0; i < N * 2; i++) {
                long a = sc.nextLong();
                arr[i] = a;
                visited[i] = true; // 사용하지 않은 값 true
            }

            int idx = 0;
            for (int i = 0; i < N * 2 ; i++) {
                if (visited[i]){
                    long cur = arr[i];
                    for (int j = i; j < N * 2; j++) {
                        long before = cur * 4 / 3;
                        if (arr[j] == before && visited[j]){
                            result[idx] = cur;
                            visited[i] = false;
                            visited[j] = false;
                            idx++;
                            break;
                        }
                    }
                }
            }
            System.out.print("#" + test_case + " ");
            for(long a : result){
                System.out.print(a + " ");
            }
            System.out.println(" ");
        }
    }
}