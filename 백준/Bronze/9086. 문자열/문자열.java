import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String name[] = new String[a];
        for (int i = 0; i < a; i++) {
            String str = sc.next();
            name[i] = str.substring(0,1) + str.substring(str.length()-1, str.length());
        }
        sc.close();
        for(int i =0; i<a; i++){
            System.out.println(name[i]);
        }

    }
}