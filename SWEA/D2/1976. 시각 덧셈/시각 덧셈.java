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
            int [] arr = new int[4];
            for (int i = 0; i < 4; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            arr[0] = arr[0] + arr[2];
            arr[1] = arr[1] + arr[3];
            if(arr[0] > 12){
                arr[0] =  arr[0] - 12;
            }
            if (arr[1] > 60) {
                arr[1] = arr[1] - 60;
                arr[0] = arr[0] + 1;
            }
            System.out.println("#" + test_case + ' ' + arr[0] + ' ' + arr[1]);
        }
    }
}
