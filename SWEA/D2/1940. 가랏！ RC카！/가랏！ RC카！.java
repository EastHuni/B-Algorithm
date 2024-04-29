import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_Case = 1; test_Case <= T; test_Case++) {
            int N = sc.nextInt();
            int s = 0;
            int distance = 0;
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                switch (a){
                    case 0:{
                     distance += s;
                     break;
                    }
                    case 1:{
                        int b = sc.nextInt();
                        s += b;
                        distance += s;
                        break;
                    }
                    case 2: {
                        int b = sc.nextInt();
                        if (s == 0){
                            continue;
                        }
                        s -= b;
                        distance += s;
                        break;
                    }
                }
            }
            System.out.print("#" + test_Case + " " + distance);
            System.out.println();
        }
    }
}