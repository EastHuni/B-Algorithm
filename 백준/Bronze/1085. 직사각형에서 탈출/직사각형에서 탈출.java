import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();

        int [] arr = new int[4];
        arr[0] = X;
        arr[1] = Y;
        arr[2] = H -Y;
        arr[3] = W - X;
        int min = arr[0];
        for (int i =0; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}