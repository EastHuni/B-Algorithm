import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int A, B, C;
        int price;
        int max = 0 ;
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        if( A != B && A != C && B != C){
            if(A > B && A >C){
                max = A;
            }
            else if(B > A && B > C){
                max = B;
            }
            else if(C > A  && C> B){
                max = C;
            }
            System.out.println( max * 100 );

        }
        else if (A == B && A == C) {
            price = 10000 + (A * 1000);
            System.out.println(price);
        }
        else if(A == B || A ==C){
            price = 1000 + (A * 100);
            System.out.println(price);
        }
        else if(B == C){
            price = 1000 + (B * 100);
            System.out.println(price);
        }




    }


}