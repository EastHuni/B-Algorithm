import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            String [] arr = new String[N]; //10
            String [] arr2 = new String[M]; //12
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < arr.length; i++) {
                arr[i] = st.nextToken();
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = st.nextToken();
            }
            int Q = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(test_case).append(" ");
            for (int i = 0; i < Q; i++) {
                int Y = Integer.parseInt(br.readLine());
                int ten = (Y-1) % N;
                int ele = (Y-1) % M;
                sb.append(arr[ten]).append(arr2[ele]).append(" ");
            }
            System.out.println(sb);
        }
    }
}