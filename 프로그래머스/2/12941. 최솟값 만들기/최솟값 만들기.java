import java.util.Arrays;
import java.util.Collections;
class Solution
{
    public int solution(int []A, int []B)
    {
        Integer [] b = new Integer [B.length];
        for(int i = 0; i< B.length;i++){
            b[i] = B[i];
        }
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(b, Collections.reverseOrder());
        for(int i= 0; i< A.length; i++){
            answer += A[i] * b[i];
        }

        return answer;
    }
}