import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
    static final int MAX = 1_000_001;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        int [] count = new int[MAX];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            count[arr[i]]++;

        }
        for (int i = 0; i < arr.length; i++) {
            while(!stack.empty() && count[arr[i]] > count[arr[stack.peek()]]){
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        while (!stack.empty()){
            arr[stack.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb);

    }
}