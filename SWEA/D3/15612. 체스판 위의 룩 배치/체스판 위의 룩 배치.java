import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            Character [][] arr = new Character[8][8];
            String result = "yes";
            int count = 0;
            for (int i = 0; i < 8; i++) {
                String str = br.readLine();
                for (int j = 0; j < 8; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (arr[i][j] == 'O'){
                        count++;
                    }
                }
                if (count != 1){
                    result = "no";
                    break;
                }
                count = 0;
            }
                

            if (result != "no"){
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (arr[j][i] == 'O'){
                            count++;
                        }
                    }
                    if (count != 1){
                        result = "no";
                        break;
                    }
                    count = 0;
                }
            }
            System.out.println("#" + test_case + " " + result);
        }
    }
}