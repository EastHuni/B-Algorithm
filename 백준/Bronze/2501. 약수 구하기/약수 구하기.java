import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int [] arr = new int[n];

        for(int i = 1; i<= n; i++) {
            if (n%i == 0) {
                arr[count] = i;
                count++;
            }
        }
        System.out.println(arr[k-1]);

    }

}