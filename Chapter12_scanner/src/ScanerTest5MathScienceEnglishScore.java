import java.util.Scanner;

public class ScanerTest5MathScienceEnglishScore {

	public static void main(String[] args) {

		/*
		5. 아래의 프로그램에서 기존에 값을 다이렉트로 넣었던 부분을 Scanner 로 입력 받아 처리 하시오
		int math, science, english;
		math = 90;
		science = 80; 
		english = 80;

		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
		System.out.println(me.getGrade()); //우 입니다.
		 */
		int math, science, english;
		
		System.out.println("수학,과학,영어 점수 3개를 모두 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		math = sc.nextInt();
		science = sc.nextInt();
		english = sc.nextInt();
		
		Grade me = new Grade(math, science, english);
		
		System.out.println("평균은 " + me.average());
		System.out.println(me.getGrade()); //우 입니다.
	}
}
