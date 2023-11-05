import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int len = str.length();
        int ans = 1;
        for(int i = 0; i< len/2; i++){
            if(str.charAt(i) != str.charAt(len-1-i)){
                ans = 0;
        }
        }
        System.out.println(ans);



    }
}