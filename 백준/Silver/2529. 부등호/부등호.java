import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static boolean  [] visited;
    static int min, max, K;
    static String [] str;
    static int [] answer;
    static String s;
    static ArrayList <String> arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(br.readLine());
        arr = new ArrayList<>();
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        str = new String[K];
        answer = new int [K+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            str[i] = st.nextToken();
        }
        for (int i = 0; i < 10; i++) {
            visited = new boolean[10];
            visited[i] = true;
            dfs(i, 0, i+ "");
            visited[i] = false;
        }
        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-1));
        System.out.println(arr.get(0));

    }
    public static void dfs(int start, int depth, String a){
        if (a.length() == K+1){
            arr.add(a);
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (!visited[i]){
                if (str[depth].equals("<")){
                    if (start < i){
                        visited[i] = true;
                        dfs(i, depth + 1, a+i);
                        visited[i] = false;
                    }
                }
                else {
                    if (start > i){
                        visited[i] = true;
                        dfs(i, depth + 1, a+i);
                        visited[i] = false;
                    }
                }
            }
        }
    }
}