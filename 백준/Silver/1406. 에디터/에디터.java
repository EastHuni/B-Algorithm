import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            left.push(str.charAt(i));
        }
        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String a = br.readLine();
            switch (a.charAt(0)) {
                case 'L':
                    if (!left.empty()){
                        right.push(left.pop());
                    }
                    break;
                case 'D':
                    if (!right.empty()){
                        left.push(right.pop());
                    }
                    break;
                case 'B':
                    if (!left.empty()){
                        left.pop();
                    }
                    break;
                case 'P':
                    char d = a.charAt(2);
                    left.push(d);
                    break;
            }
        }
        while (!left.empty()){
            right.push(left.pop());
        }
        while (!right.empty()){
            sb.append(right.pop());
        }
        System.out.println(sb);
    }

}