import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int [] arr = new int[N];
        Stack <Double> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('A' <= c && c <= 'Z'){
                double d = arr[c - 'A'];
                stack.push(d);
            }else {
                double d1 = stack.pop();
                double d2 = stack.pop();
                double d3 = 0.0;
                switch (c) {
                    case '+' :
                        d3 = d2 + d1;
                        break;
                    case '-' :
                        d3 = d2 - d1;
                        break;
                    case '*' :
                        d3 = d2 * d1;
                        break;
                    case '/' :
                        d3 = d2 / d1;
                        break;
                }
                stack.push(d3);
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}