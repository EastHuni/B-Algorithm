import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 1;
        int length = 10;
        int result = 0;
        for (int i = 1; i <= num ; i++) {
            if (i == length){
                count++;
                length *= 10;
            }
            result += count;
        }
        System.out.println(result);

    }
}