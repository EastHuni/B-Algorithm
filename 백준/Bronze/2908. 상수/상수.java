import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        char [] arr1 = new char[3];
        char [] arr2 = new char[3];
        int n = 0;
        for (int i = 2 ; i >= 0; i--){
            arr1[i] = str1.charAt(n);
            arr2[i] = str2.charAt(n);
            n++;
         }
        String str_num1 = new String(arr1);
        String str_num2 = new String(arr2);

        int a = Integer.parseInt(str_num1);
        int b = Integer.parseInt(str_num2);

        System.out.println(a>b?a:b);
        }

    }