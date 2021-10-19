import java.util.Scanner;

public class OTodayTest1Oop {

	/*
	 8. 사용자로부터 받은 문자열(영문으로)에서
	  자음과 모음 개수를 계산하는 프로그램을 작성
	 */
	
	public static void main(String[] args) {
		System.out.println("문자열(영문으로)입력:");
		Scanner sc = new Scanner(System.in);
		ConsonantVowel cv = new ConsonantVowel(sc.next());
		cv.printCount();
	}
}	


class ConsonantVowel{
	private int consonant;//자
	private int vowel;//모
	private String str;
	ConsonantVowel(String str){
		consonant = 0;
		vowel = 0;
		this.str = str;
	}
	private boolean check(char tmp) {
		if(tmp == 'a' || tmp == 'A' || 
				tmp == 'e' || tmp == 'E' ||
				tmp == 'i' || tmp == 'I' ||
				tmp == 'o' || tmp == 'O' ||
				tmp == 'u' || tmp == 'U' 
				) {
			return true;
		}else {
			return false;
		}
	}
	
	void printCount() {
		for(int i=0; i< str.length(); i++){
			if(check(str.charAt(i))) {
				vowel ++;
			}else {
				consonant ++;
			}
		}
		System.out.println("총글자수는 " + str.length() + "개");
		System.out.println("자음:" + consonant + "개");
		System.out.println("모음:" + vowel + "개");
		
	}
}