import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        
        int N = sc.nextInt();
        int a = 1;
        int b = 0;
        int count =1;
        
        while (N != 1){
            
            a += (b * 6);
            if( N <= a){
                break;
            }
            count++;
            b++;
        }
        System.out.println(count);
        
    }
}