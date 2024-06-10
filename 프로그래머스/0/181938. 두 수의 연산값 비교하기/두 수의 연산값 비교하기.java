class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s = String.valueOf(a) + String.valueOf(b);
        int s1 = 2 * a * b;
        if (Integer.parseInt(s) >= s1){
            answer = Integer.parseInt(s);
        }else answer = s1;
        return answer;
    }
}