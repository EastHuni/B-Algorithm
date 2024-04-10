import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long [] arr = new long[2];
        for (int i = 0; i < 2; i++) {
            String str1 = sc.next();
            String str2 = sc.next();
            arr[i] = Long.parseLong(add(str1, str2));
        }
        System.out.println(arr[0] + arr[1]);

    }
    public static String add (String a, String b){
        return a + b;
    }


}