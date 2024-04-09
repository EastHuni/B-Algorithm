import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int [] arr = new int[4];
        String s;
        while ((s = br.readLine()) != null){
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'a' && ch <= 'z'){
                    count1++;
                } else if (ch >= 'A' && ch <= 'Z') {
                    count2++;
                } else if (ch == ' ') {
                    count4++;
                }else count3++;

            }
            sb.append(count1).append(' ');
            sb.append(count2).append(' ');
            sb.append(count3).append(' ');
            sb.append(count4).append(' ');
            sb.append('\n');
        }
        System.out.println(sb);
    }
}