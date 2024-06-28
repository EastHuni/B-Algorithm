class Solution {
    public int solution(String s) {
        int answer = 0;
        String a = "";
         if (s.charAt(0) == '-'){
            a += "-";
        }
        for(int i = 0; i < s.length (); i++){
            char c = s.charAt(i);
            if (c != '-'){
                a += c;
            }
        }
        answer = Integer.parseInt(a);
        return answer;
    }
}