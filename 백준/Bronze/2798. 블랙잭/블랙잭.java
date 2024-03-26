import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        int temp = 0;

        int [] arr = new int[N];
        for (int i = 0; i< N; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i< N-2; i++){
            for (int j = i+1; j< N-1;j++){
                for(int h= j+1; h< N; h++){
                    sum = arr[i] + arr[j] + arr[h];
                    if (temp < sum && sum <= M) {
                        temp = sum;
                    }
                }
            }
        }
        System.out.println(temp);
    }
}