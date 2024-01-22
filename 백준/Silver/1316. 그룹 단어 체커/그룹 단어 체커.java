import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        int N = sc.nextInt();
        for (int i = 0; i <N; i++){

            if(check()== true){
                count++;
            }
        }
        System.out.println(count);

    }


    public static boolean check(){
        boolean [] check = new boolean[26];
        int prev = 0;
        String str = sc.next();

        for(int i = 0; i<str.length(); i++){
            char now = str.charAt(i);


            if (prev != now){  // 이전값과 현재값이 다를때

                if(check[now - 'a'] == false){ //처음 나온문자인지 체크
                    check[now - 'a'] = true; // 처음나왔다면 true 로 채워줌
                    prev = now;   // 현재문자 갱신
                }
                // 해당 문자가 이미 나온적이 있는 경우 ( 그룹단어가 아님 )
                else{
                    return false;  // 함수 종료
                }
            }
            else {
                continue;
            }
        }
        return true;

    }
}