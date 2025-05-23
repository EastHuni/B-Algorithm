import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_Case = 0; test_Case < T; test_Case++) {
            int N = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            int [] arr = new int[N];
            int count = 0;
            while (N > 1){
                if (N % 2 == 1){
                    arr[count] = 1;
                    count++;
                    N = N / 2;
                }else {
                    arr[count] = 0;
                    count++;
                    N = N / 2;
                }
            }
            arr[count] = 1;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 1){
                    sb.append(i).append(" ");
                }
            }
            System.out.println(sb);
        }
    }
}
