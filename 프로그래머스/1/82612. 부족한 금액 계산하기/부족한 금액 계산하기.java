class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i=price; i<= price * count; i+=price){
            answer += i;
        }
        if(money >= answer){
            return 0;
        }else return answer-money;
    }
}