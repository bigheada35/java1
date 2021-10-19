import java.util.Scanner;

//import java.util.Scanner;

public class OTodayTest1 {

	/*
	 8. 사용자로부터 받은 문자열(영문으로)에서
	  자음과 모음 개수를 계산하는 프로그램을 작성
	 */
	
	public static void main(String[] args) {
		
		System.out.println("영어 4글짜를 를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char tmp;
		int cnt_a = 0; 
		int cnt_b = 0;
		for(int i = 0; i<str.length(); i++) {
			tmp = str.charAt(i);
			if(tmp == 'a' || tmp == 'A' || 
				tmp == 'e' || tmp == 'E' ||
				tmp == 'i' || tmp == 'I' ||
				tmp == 'o' || tmp == 'O' ||
				tmp == 'u' || tmp == 'U' 
				) {
					cnt_a++;
				
			}else {
				cnt_b++;
			}
		}
		System.out.println("입력:" + str);
		System.out.println();
		
		System.out.println("총글자수는 " + str.length() + "개");
		System.out.println("자음:" + cnt_b + "개");
		System.out.println("모음:" + cnt_a + "개");
	}


	
	
	
}	