import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
                String num = Integer.toString(i);
            for (int j = 0; j < num.length(); j++) {
                char ch = num.charAt(j);
                if ((int)ch % 3 == 0 && ch != '0'){
                    cnt++;
                }
            }
            if (cnt>0){
                while(cnt > 0){
                    System.out.print('-');
                    cnt--;
                }
                System.out.print(' ');
            }else System.out.print(num+ ' ');
        }
        System.out.println(' ');
    }
}