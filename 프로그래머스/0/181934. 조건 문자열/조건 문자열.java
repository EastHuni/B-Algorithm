class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String s = ineq + eq;
        switch(s){
            case ">=":
                if (n >= m){
                    answer = 1;
                    break;
                }else {
                    answer = 0;
                break;
                }
            case "<=":
                if(n <= m){
                    answer= 1;
                    break;
                }else {
                    answer = 0;
                    break;
                }
            case ">!":
                if(n > m){
                    answer = 1;
                    break;
                }else {
                    answer = 0;
                    break;
                }
            case "<!":
                if(n < m){
                    answer = 1;
                    break;
                }else {
                    answer = 0;
                    break;
                }
        }
        return answer;
    }
}