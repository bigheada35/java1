package d_today_tests7_teacher;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			try {
				String words = sc.nextLine();
				if(words.equals("그만")) {
					System.out.println("종료합니다. ");
					break;
				}
				StringTokenizer tokens = new StringTokenizer(words, " ");
			    System.out.println("어절갯수는" + tokens.countTokens());
				
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("잘못된 입력입니다.");
			}
			


		}//while
	}


}

/*
 * 결과:
 * 
 */

/*

*/