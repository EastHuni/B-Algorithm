import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int count = 0;
		char next_char;
		sc.close();
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			
			if(c=='c') {
				if(i<str.length()-1) {
					next_char = str.charAt(i+1);
					if(next_char == '=' || next_char == '-') {
						i++;
					}
				}
			}
			else if(c=='d') {
				if(i<str.length()-1) {
					next_char = str.charAt(i+1);
					if(next_char == 'z') {
						if(i<str.length()-2) {
							next_char = str.charAt(i+2);
							if(next_char == '=') {
								i += 2;
							}
						}
					}
					else if(next_char == '-') {
						i++;
					}
				}
			}
			else if(c=='l' || c=='n') {
				if(i<str.length()-1) {
					next_char = str.charAt(i+1);
					if(next_char == 'j') {
						i++;
					}
				}
			}
			else if(c=='s' || c=='z') {
				if(i<str.length()-1) {
					next_char = str.charAt(i+1);
					if(next_char == '=') {
						i++;
					}
				}
			}
			count++;
		}
		System.out.println(count);
	}
}