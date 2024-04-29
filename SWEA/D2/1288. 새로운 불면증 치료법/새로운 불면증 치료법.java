import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int cnt = 0;
            boolean[] visited = new boolean[10];
            int n = sc.nextInt();
            int num = 0;

            while (cnt < 10){
                num += n;
                String str = Integer.toString(num);
                for (int i = 0; i < str.length(); i++) {
                    int number = Character.getNumericValue(str.charAt(i));
                    if (!visited[number]){
                        visited[number] = true;
                        cnt +=1;
                    }
                }
            }
            System.out.println("#" + test_case + " " + num);
        }
    }
}