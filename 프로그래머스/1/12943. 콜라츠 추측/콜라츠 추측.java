class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        for(int i = 0; i< 400; i++){
            if( num == 1){
                break;
            }else if(num % 2 == 0){
                num /= 2;
                count++;
            }else {
                num = num * 3 + 1;
                count++;
            }
        }
        if(count >= 400){
            answer = -1;
        }else answer = count;
        return answer;
    }
}