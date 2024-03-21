import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int result2 = 0;
        int [] arr = new int[3];
        int [] arr2 = new int [3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        if(arr[0] == arr[1]){
            result = arr[2];
        } else if (arr[1] == arr[2]) {
            result = arr[0];
        }
        else result = arr[1];

        if(arr2[0] == arr2[1]){
            result2 = arr2[2];
        } else if (arr2[1] == arr2[2]) {
            result2 = arr2[0];
        }
        else result2 = arr2[1];

        System.out.print(result + " ");
        System.out.println(result2);
    }

}