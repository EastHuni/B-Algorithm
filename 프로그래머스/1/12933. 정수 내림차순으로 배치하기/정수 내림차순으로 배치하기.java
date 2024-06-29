import java.util.*;
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String ans = "";
        String [] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        for(String s: str) ans += s;
        answer = Long.parseLong(ans);
        return answer;
    }
}