class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        int count = 0;
        for(int i = 0; i< 500; i++){
            if( n == 1){
                return i;
            }else if(n % 2 == 0){
                n /= 2;
            }else {
                n = n * 3 + 1;
            }
        }
        return -1;
    }
}