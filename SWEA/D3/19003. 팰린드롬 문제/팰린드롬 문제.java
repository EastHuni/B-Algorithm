import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_Case = 1; test_Case <= T; test_Case++) {
            StringTokenizer st =  new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            boolean check = false;
            int result = 0;
            Set<String> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                String str = br.readLine();
                if (set.contains(str)) {
                    result += M * 2;
                } else {
                    if (!check && ispal(str)) {
                        check = true;
                        result += M;
                    } else {
                        StringBuilder sb = new StringBuilder(str);
                        set.add(sb.reverse().toString());
                    }
                }
            }
            System.out.println("#" + test_Case + " " + result);
        }
    }
    static boolean ispal(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

}