import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int [] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                arr[ch - 'a'] = s.indexOf(ch);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb);
    }
}