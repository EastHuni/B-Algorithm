import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [26];
        StringBuilder sb = new StringBuilder();
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch<= 'z'){
                arr[ch - 'a']++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb);
    }
}