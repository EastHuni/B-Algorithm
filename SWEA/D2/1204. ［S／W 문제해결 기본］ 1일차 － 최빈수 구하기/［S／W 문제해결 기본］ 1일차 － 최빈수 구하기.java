import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int [] arr = new int[101];
            for (int i = 0; i < 1000; i++) {
                int a = sc.nextInt();
                arr[a]++;
            }
            int max = 0;
            int check = 0;
            for (int i = 0; i < arr.length; i++) {
                if (max == arr[i]){
                    if (check < i){
                        check = i;
                    }
                }
                if (max < arr[i]){
                    max = arr[i];
                    check = i;
                }
            }
            System.out.println("#" +  test_case + " " + check);
        }

    }
}