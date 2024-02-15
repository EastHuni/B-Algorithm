import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++){
            int k = sc.nextInt();
            for (int j = 2; j <=k; j++){
                if (j == k) {
                    count++;
                }
                if (k % j == 0){
                    break;
                }

            }
        }
        System.out.println(count);
    }
}