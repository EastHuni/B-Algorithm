import java.io.BufferedReader;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            String A = st.nextToken();
            // a * b / 최대공약수 = 최소공배수
            int l = S.length() * A.length() / GCD(S.length(),A.length());
            String rs = "";
            String ra = "";
            for (int j = 0; j < l/S.length(); j++) {
                rs += S;
            }
            for (int j = 0; j < l/A.length(); j++) {
                ra += A;
            }
            if (rs.equals(ra)){
                System.out.println("#" + i + " " + "yes");
            }else System.out.println("#" + i + " " + "no");
        }


    }
    //GCD 최대공약수
    private  static int GCD(int a, int b){
        if (b == 0){
            return a;
        }else {
            return GCD(b, a%b);
        }
    }
}