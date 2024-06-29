class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean [] check = new boolean[10];
        for(int i = 0; i< numbers.length; i++){
            check[numbers[i]] = true;
        }
        for(int j = 0; j<check.length; j++){
            if(check[j] == false){
                answer += j;
            }
        }
        return answer;
    }
}