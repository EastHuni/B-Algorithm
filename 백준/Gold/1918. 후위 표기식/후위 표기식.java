import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> op = new Stack<>();
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch  = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                sb.append(ch);
            }
            else if (ch != '(' && ch != ')'){
                while (!op.isEmpty() && priority(op.peek()) >= priority(ch)){
                    sb.append(op.pop());
                }
                op.push(ch);
            } else if (ch == '(') {
                op.push(ch);
            }
            else {
                while (op.peek() != '('){
                    sb.append(op.pop());
                }
                op.pop();
            }
        }
        while (!op.isEmpty()){
            sb.append(op.pop());
        }
        System.out.println(sb);
    }

    public static int priority(char c){
        if (c == '*' || c == '/') return 2;
        else if(c == '+' || c=='-') return 1;
        else return 0;
    }
}