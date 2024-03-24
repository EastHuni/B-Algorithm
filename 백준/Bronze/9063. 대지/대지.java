import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int [N];
        int [] arr2 = new int [N];
        for(int i = 0 ; i< N; i++){
            arr[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int max2 = arr2[0];
        int min2 = arr2[0];

        for(int i = 0; i < N; i++){
            if (max < arr[i]){
                max = arr[i];
            }
            if (max2 < arr2[i]){
                max2 = arr2[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
            if (min2 > arr2[i]){
                min2 = arr2[i];
            }

        }
        System.out.println((max - min) * (max2 - min2));


    }
}