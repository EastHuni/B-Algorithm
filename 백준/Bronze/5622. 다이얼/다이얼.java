import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sec = 0;
        int sum = 0;
        for ( int i = 0 ; i < str.length(); i++){
            if (str.charAt(i) == 'A' || str.charAt(i) == 'B' || str.charAt(i) == 'C'){
                sec = sec + 3;
            }
            else if (str.charAt(i) == 'D' || str.charAt(i) == 'E' || str.charAt(i) == 'F'){
                sec = sec + 4;
            }
            else if (str.charAt(i) == 'G' || str.charAt(i) == 'H' || str.charAt(i) == 'I'){
                sec = sec + 5;
            }
            else if (str.charAt(i) == 'J' || str.charAt(i) == 'K' || str.charAt(i) == 'L'){
                sec = sec + 6;
            }
            else if (str.charAt(i) == 'M' || str.charAt(i) == 'N' || str.charAt(i) == 'O'){
                sec = sec + 7;
            }
            else if (str.charAt(i) == 'P' || str.charAt(i) == 'Q' || str.charAt(i) == 'R' || str.charAt(i) == 'S'){
                sec = sec + 8;
            }
            else if (str.charAt(i) == 'T' || str.charAt(i) == 'U' || str.charAt(i) == 'V' ){
                sec = sec + 9;
            }
            else if (str.charAt(i) == 'W' || str.charAt(i) == 'X' || str.charAt(i) == 'Y' || str.charAt(i) == 'Z'){
                sec = sec + 10;
            }
            sum += sec;
        }
        System.out.println(sec);
        }


    }