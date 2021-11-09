package d_today_test8_teacher;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Test8 {
	public static void main(String[] args) {
		final int SCORE_COUT = 6;
		ArrayList<Character> arrList = new ArrayList<>();
		
		try { // 주의 : 에러처리 하자~
			Scanner sc = new Scanner(System.in);
			System.out.println("6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력");
			for(int i=0; i <SCORE_COUT ; i++) {
				char ch = sc.next().charAt(0);
				
				// 주의 : 참조 : 암기 : 여기서 강제로 exception을 내가 떤진다. 그러면
				// 아래의 try catch 의 catch부분으로 들어 가게 된다.
				switch(ch) {
				case 'A', 'a','B', 'b', 'C', 'c', 'D', 'd', 'F', 'f':
					break;
				default:
					throw new InputMismatchException();
				
				}
				
				arrList.add(ch);
				
			}
			
			int sum = 0;
			for(int i=0; i< arrList.size(); i++) {
				char ch = arrList.get(i);
				
				switch(ch) {
				case 'A', 'a':
					sum = sum +4;
					break;
				case 'B','b':
					sum = sum + 3;
					break;
				case 'C', 'c':
					sum = sum + 1;
					break;
				case 'F', 'f':
					sum = sum + 0;
					break;
				default:
					System.out.println("잘못된 점수 입니다.");
				}
			}
			
			
			double avg = sum / (double)arrList.size();
			System.out.println(avg);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("잘못된 입력 입니다. 처움부터 다시 입력해 주세요.");
			// 주의 : main도 그냥 함수이다. 다시 콜 하면 된다.
			//  졸지 마세요 다시 시작 하면 됩니다.
			// 주의 : 인자만 맞춰 주면 됩니다.
			main(args);
		}
		


	}
	
	
}


/*
8.Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 

문자로 입력받아 ArrayList에 저장하고,

ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 

변환하여 평균을 출력하는 프로그램을 작성하라.
*/
