import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()){
            String str =sc.nextLine();
            System.out.println(str);
            
        }
        sc.close();


    }
}