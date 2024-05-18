import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue <Integer> que = new LinkedList<>();
        for (int test_case = 1; test_case <= 10; test_case++) {
            int T = Integer.parseInt(br.readLine());
            sb.append("#" + T + " ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 8; i++) {
                que.add(Integer.parseInt(st.nextToken()));
            }
             L: while (true){
                int count = 1;
                for (int i = 0; i < 5; i++) {
                    int a = que.poll() - count;
                    if (a <= 0){
                        que.add(0);
                        break L;
                    }
                    que.add(a);
                  count++;
                }
            }
            while (!que.isEmpty()){
                sb.append(que.poll()).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}