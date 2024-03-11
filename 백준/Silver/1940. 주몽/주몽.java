import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] arr = new int[N];
        int count = 0;
        int first_index = 0;
        int last_index = N-1;
        for(int i = 0; i< N ;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        while (first_index<last_index){
            if (arr[first_index] + arr[last_index] == M){
                first_index++;
                last_index--;
                count++;
            } else if (arr[first_index] + arr[last_index] < M) {
                first_index++;

            } else if (arr[first_index] + arr[last_index] > M) {
                last_index--;
            }else
                break;
        }
        System.out.println(count);


    }
}