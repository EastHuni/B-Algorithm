import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            String s = sc.next();
            for (int j = 1; j <= s.length(); j++) {
                String b = s.substring(0,j);
                String c = s.substring(j,j+j);
                if (b.equals(c)){
                    System.out.println("#" + i + " " + j);
                    break;
                }
            }
        }
    }
}