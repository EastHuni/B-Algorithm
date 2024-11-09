import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static String [] arr;
    static String [] answer;
    static int L;
    static int C;
    static boolean [] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        visited = new boolean[C];
        arr = new String[C];
        answer = new String[C];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            arr[i] = st.nextToken();
        }
        Arrays.sort(arr);
        dfs(0,0);
        System.out.println(sb);
    }
    public static void dfs(int at, int depth){
        if (depth == L){
            if (check()) {
                for (int i = 0; i < L; i++) {
                    sb.append(answer[i]);
                }
                sb.append('\n');
            }
            return;
        }
        for (int i = at; i < C; i++) {
            if (!visited[i]){
                visited[i] = true;
                answer[depth] = arr[i];
                dfs(i, depth + 1);
                visited[i] =false;
            }
        }
    }
    public static boolean check(){
        int jcount = 0;
        int mcount = 0;
        for (int i = 0; i < L; i++) {
            if(answer[i].equals("a") || answer[i].equals("e") || answer[i].equals("i") || answer[i].equals("o") || answer[i].equals("u")){
                jcount++;
            }else mcount++;
        }
        if (jcount >= 1 && mcount >=2){
            return true;
        }
        return false;
    }
}