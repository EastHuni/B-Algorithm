import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char [] ch = sc.nextLine().toCharArray();
        int [] result = new int[26];
        for (int i = 0; i < ch.length; i++) {
            int n = ch[i] - 'a';
            result[n]++;
        }
        for(int i = 0; i< result.length; i++){
            System.out.print(result[i]+ " ");
        }
    }
}
