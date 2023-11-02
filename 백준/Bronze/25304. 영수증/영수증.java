import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int hap = 0;
        int sum = in.nextInt();
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n ; i++){

            int a = in.nextInt();
            int b = in.nextInt();

            arr[i] = a * b ;
        }

        for(int j = 0; j < n; j++){
            hap += arr[j];
        }
        if (hap == sum){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        }



    }