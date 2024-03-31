import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        Integer[] arr = new Integer[N.length()];

        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            arr[i] = Character.getNumericValue(c);
        }
        Arrays.sort(arr,Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}