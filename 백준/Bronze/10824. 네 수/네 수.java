import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long [] arr = new long[2];
        for (int i = 0; i < 2; i++) {
            String str1 = sc.next();
            String str2 = sc.next();
            arr[i] = Long.parseLong(str1 + str2);
        }
        System.out.println(arr[0] + arr[1]);

    }
}
