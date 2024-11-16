import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = 10;
        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            int [] arr = new int[N];
            int result = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 2; j < N-2; j++) {
                    if (arr[j] > arr[j+1] && arr[j] > arr[j+2] && arr[j] >arr[j-1] && arr[j] > arr[j-2]){
                        int [] check = {arr[j+1], arr[j+2], arr[j-1], arr[j-2]};
                        Arrays.sort(check);
                        result += arr[j] - check[3];
                    }
            }
            System.out.println("#" + i + " " + result);
        }

    }
}