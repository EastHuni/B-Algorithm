import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0 ; i < str.length()  ; i++){
            if (str.charAt(i) == ' '){
                count++;

            }

        }
        if(str.charAt(0) != ' ' && str.charAt(str.length()-1) != ' '){ //첫 번째와 마지막이 공백이 아닌 경우
            count = count + 1;
        }
        if(str.charAt(0) == ' ' && str.charAt(str.length()-1) == ' '){ //첫 번째와 마지막이 공백인 경우
            count = count - 1;
        }
        System.out.println(count);
        }
    }