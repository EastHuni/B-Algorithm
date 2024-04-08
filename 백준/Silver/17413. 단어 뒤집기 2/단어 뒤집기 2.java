import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String s = br.readLine();
        boolean check = false;


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<'){
                check = true;
                while (!stack.empty()){
                    sb.append(stack.pop());
                }
                sb.append(s.charAt(i));
            }
            else if (s.charAt(i) == '>') {
                check = false;
                sb.append(s.charAt(i));

            }
            else if (check){
                sb.append(s.charAt(i));
            }
            else if (!check){
                if (s.charAt(i) == ' ') {
                    while (!stack.empty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(s.charAt(i));
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
        }
        while (!stack.empty()){
            sb.append(stack.pop());
        }
        System.out.println(sb);


    }
}