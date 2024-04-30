import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken()); // A사의 1l 당 요금
            int Q = Integer.parseInt(st.nextToken()); // B 사의 R리터 이하 요금 (기본요금)
            int R = Integer.parseInt(st.nextToken()); // B 사의 R리터
            int S = Integer.parseInt(st.nextToken()); // B 사의 R리터 초과시 1L 당요금
            int W = Integer.parseInt(st.nextToken()); // 종민이 집의 한달 수도 양
            int resultA = 0;
            int resultB = 0;
            resultA = W * P;
            if (W <= R){
                resultB = Q;
            }else resultB = Q + ((W-R) * S) ;
            int answer = resultA < resultB ? resultA : resultB;
            System.out.println("#" + test_case + " " + answer);
        }
    }
}