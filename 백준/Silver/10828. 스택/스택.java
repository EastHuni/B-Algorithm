import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static int[] Stack;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        Stack = new int[N];

        for (int i = 0; i < N; i++) {
            String str = sc.next();

            switch (str) {
                case "push":
                    push(sc.nextInt());
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }

        }
        System.out.println(sb);

    }

    public static void push(int item) {
        Stack[size] = item;
        size++;
    }

    public static int pop(){

        if (size == 0){
            return  -1;
        }
        else {
            int value = Stack[size - 1];
            Stack[size - 1] = 0;
            size--;
            return value;
        }

    }

    public static int size() {
        return  size;
    }

    public static int empty() {
        if (size == 0){
            return 1;
        }
        else return 0;
    }

    public static int top() {
        if (size == 0){
            return -1;
        }
        else return Stack[size - 1];
    }


}