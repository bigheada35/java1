import java.util.Scanner;

//import java.util.Scanner;

public class OTodayTest2 {

	public static void main(String[] args) {
		
		System.out.println("영어 4글짜를 를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char tmp;
		for(int i = 0; i<str.length(); i++) {
			tmp = str.charAt(i);
		}
		System.out.println("입력:" + str);
		System.out.print("출력:");
		for(int i = (str.length()-1); i>= 0; i--) {
			tmp = str.charAt(i);
			System.out.print(tmp);
		}
		System.out.println();
		
	}


	
	
	
}	