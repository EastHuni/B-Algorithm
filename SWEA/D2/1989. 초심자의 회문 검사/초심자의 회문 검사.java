import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            String str = sc.next();
            int result = 1;
            for (int j = 0; j < str.length()/2 + 1; j++) {
                if (str.charAt(j) != str.charAt(str.length()-j-1)){
                    result = 0;
                    break;
                }
            }
            System.out.println("#" + i + " " + result);
        }
    }
}