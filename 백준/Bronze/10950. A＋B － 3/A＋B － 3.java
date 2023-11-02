import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            arr[i] = a + b;
        }

        for (int k : arr){
            System.out.println(k);
        }



    }


}