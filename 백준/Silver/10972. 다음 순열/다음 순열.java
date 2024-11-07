import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if (nestPermutation()){
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
        }else System.out.println("-1");

    }
    public static boolean nestPermutation(){
        int point = -1;
        for (int i = N-1; i > 0; i--) {
            if (arr[i-1]< arr[i]){
                point = i;
                break;
            }
        }
        if (point == -1) {
            return false;
        }

        int change = -1;
        for (int i = N-1; i >= point; i--) {
            if (arr[point-1] <= arr[i]){
                change = i;
                break;
            }
        }
        swap(point-1, change);

        change = N -1;
        while(point< change){
            swap(point,change);
            point++;
            change--;
        }
        return true;

    }
    public static void swap(int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return;
    }
}