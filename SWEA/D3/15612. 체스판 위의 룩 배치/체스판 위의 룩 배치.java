import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int TC = 1; TC <= T; TC++) {
            Character[][] map = new Character[8][8];
            String result = "yes";

            for (int i = 0; i < 8; i++) {
                String s = br.readLine();
                for (int j = 0; j < 8; j++) {
                    map[i][j] = s.charAt(j);
                }
            }

            int cnt = 0;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (map[i][j] == 'O') {
                        cnt++;
                    }
                }
                if (cnt != 1) {
                    result = "no";
                    break;
                }
                cnt = 0;
            }

            if (result != "no") {
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (map[j][i] == 'O') {
                            cnt++;
                        }
                    }
                    if (cnt != 1) {
                        result = "no";
                        break;
                    }
                    cnt = 0;
                }
            }
            System.out.println("#"+TC+" "+result);
        }
    }
}