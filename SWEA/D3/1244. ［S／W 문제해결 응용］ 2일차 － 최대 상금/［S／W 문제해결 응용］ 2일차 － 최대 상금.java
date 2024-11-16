import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    static int k;
    static int max = Integer.MIN_VALUE;
    static int [] arr;;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine()); //123 1 입력받음
            String str = st.nextToken(); // 123
            arr = new int[str.length()]; // int형 배열선언
            k = Integer.parseInt(st.nextToken()); // 1
            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i) - '0';
            }  // 배열에 1 2 3 넣음
            if (arr.length < k) { // 교환횟수가 arr 보다 클경우 k 값으로 대체
                k = arr.length;
            }
            dfs(0);
            System.out.println("#" + test_case + " " + max);
            max = 0;
        }
    }

    public static void dfs( int depth) {
        if (depth == k) {
            int result = 0;
            for (int i = 0; i < arr.length; i++) {
                result += (int) (Math.pow(10, i) * arr[arr.length - i - 1]);
            }
            max = Math.max(result, max);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                swap(i, j);
                dfs(depth+1);
                swap(i, j);
            }
        }
    }

    public static void swap(int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}