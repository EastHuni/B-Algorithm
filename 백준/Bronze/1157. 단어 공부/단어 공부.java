import java.io.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        String str = sc.next();
        String str1 = str.toUpperCase(Locale.ROOT);

        for (int i = 0; i<str.length(); i++) {
            if('A' <= str1.charAt(i) && str1.charAt(i) <='Z'){
                arr[str1.charAt(i) - 'A']++;
            }

        }

        int max = -1;
        char ch = '?';

        for(int i =0; i < arr.length; i++){
            if (arr[i] > max){
               max = arr[i];
               ch = (char) (i + 65);
            }
            else if (arr[i] == max){
                ch = '?';
            }
        }

        System.out.println(ch);

    }
}