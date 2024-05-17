import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int result = 0;
        for (int test_Case = 1; test_Case <= T; test_Case++) {
            String s = sc.next();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c - 'a' == count){
                    result++;
                }else break;
                count++;
            }
            System.out.println("#" + test_Case + " " + result);
            result = 0;
        }
    }
}