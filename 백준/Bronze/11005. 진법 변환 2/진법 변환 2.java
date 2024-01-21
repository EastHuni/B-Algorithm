import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        String result = "";
        int temp = 0;

        while(n>0) {
            temp = n % b;
            if (temp >= 10) {
                char c = (char) (temp + 55);
                result += c;
            }
            else {
                result += temp;
            }
            n = n / b;
        }
        for(int i = result.length() -1 ; i >= 0; i--){
            System.out.print(result.charAt(i));
        }
    }
}