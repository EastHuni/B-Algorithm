import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        king = king - sc.nextInt();
        queen = queen - sc.nextInt();
        rook = rook - sc.nextInt();
        bishop = bishop - sc.nextInt();
        knight = knight - sc.nextInt();
        pawn = pawn - sc.nextInt();

        System.out.printf(king + " ");
        System.out.printf(queen + " ");
        System.out.printf(rook + " ");
        System.out.printf(bishop + " ");
        System.out.printf(knight + " ");
        System.out.printf(pawn + " ");



    }
}