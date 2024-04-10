import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        String [] str = new String[s.length()];

        for (int i = 0; i < str.length; i++) {
            str[i] = s.substring(i);
        }
        Arrays.sort(str);

        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]).append('\n');
        }
        System.out.println(sb);

    }
}